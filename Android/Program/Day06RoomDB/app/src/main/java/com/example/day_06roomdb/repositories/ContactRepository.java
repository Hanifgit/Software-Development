package com.example.day_06roomdb.repositories;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.day_06roomdb.ContactDB;
import com.example.day_06roomdb.entities.ContactEntity;

import java.util.List;

public class ContactRepository {
    private Context context;

    public ContactRepository(Context context) {
        this.context = context;
    }

    public void InsertContact(ContactEntity contactEntity){
        //ContactDB.getDb(context).getContactDao().insertNewContact(contactEntity);
        ContactDB.dbExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                //runs on background thread
                ContactDB.getDb(context).getContactDao().insertNewContact(contactEntity);
            }
        });
    }

    public LiveData<List<ContactEntity>> getAllContacts(){
        return ContactDB.getDb(context).getContactDao().getAllContact();
    }

    public LiveData<ContactEntity> getContactsByID(long id){
        return ContactDB.getDb(context).getContactDao().getContactByID(id);
    }

    public void DeleteContact(ContactEntity contactEntity){
        ContactDB.dbExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                ContactDB.getDb(context).getContactDao().deleteNewContact(contactEntity);
            }
        });
    }
}
