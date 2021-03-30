package com.example.day_06roomdb.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.day_06roomdb.entities.ContactEntity;

import java.util.List;

@Dao
public interface ContactDao {
    @Insert
    void insertNewContact(ContactEntity contactEntity);

    @Delete
    void deleteNewContact(ContactEntity contactEntity);

    @Update
    void updateNewContact(ContactEntity contactEntity);

    @Query("select * from tbl_contact")
    LiveData<List<ContactEntity>> getAllContact();

    @Query("select * from tbl_contact where id = :rowId")
    LiveData<ContactEntity>getContactByID(long rowId);
}
