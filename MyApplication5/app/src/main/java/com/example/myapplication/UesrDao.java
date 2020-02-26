package com.example.myapplication;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

@Dao
public interface UesrDao {

    @Query("SELECT * FROM myuser WHERE id = :id")
    MyUser getUserById(int id);
    @Query()
    @Insert
    void addUser(MyUser myUser);
    @Delete
    void deleteAllUsers();
}
