package com.example.day_06roomdb.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.day_06roomdb.ContactDB;
import com.example.day_06roomdb.entities.ContactEntity;
import com.example.day_06roomdb.repositories.ContactRepository;

import java.util.List;

public class ContactViewModel extends AndroidViewModel {
    ContactRepository contactRepository;
    public ContactViewModel(@NonNull Application application) {
        super(application);
        contactRepository = new ContactRepository(application);
    }

    public void addContact(ContactEntity contactEntity) {
        contactRepository.InsertContact(contactEntity);
    }

    public LiveData<List<ContactEntity>> fetchAllContacts(){
        return contactRepository.getAllContacts();
    }

    public LiveData<ContactEntity> fetchContactsByID(long id){
        return contactRepository.getContactsByID(id);
    }

    public  void removeContact(ContactEntity contactEntity){
        contactRepository.DeleteContact(contactEntity);
    }
}
