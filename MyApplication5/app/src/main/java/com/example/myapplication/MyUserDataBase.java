package com.example.myapplication;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {MyUser.class}, version = 1)
public abstract class MyUserDataBase extends RoomDatabase {
   public abstract UesrDao uesrDao ();
   public MyUserDataBase myUserDataBase;




}


