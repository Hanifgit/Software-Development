package com.example.day_06roomdb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.day_06roomdb.daos.ContactDao;
import com.example.day_06roomdb.entities.ContactEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {ContactEntity.class},version = 1)
public abstract class ContactDB extends RoomDatabase {
    public abstract ContactDao getContactDao();
    public static ContactDB db;
    public static ExecutorService dbExecutorService = Executors.newFixedThreadPool(4);
    public static ContactDB getDb(Context context){
        //singleton pattern
        if(db!=null){
            return db;
        }
        db = Room.databaseBuilder(context,ContactDB.class,"contact_db")
                //.allowMainThreadQueries()
                .build();
        return db;
    }
}
