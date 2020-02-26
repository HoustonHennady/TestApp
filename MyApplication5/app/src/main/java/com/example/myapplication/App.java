package com.example.myapplication;

import android.app.Application;
import android.arch.persistence.room.Room;

public class App extends Application {
    public static App instance;
    private static MyUserDataBase myUserDataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        myUserDataBase = Room.databaseBuilder(this,MyUserDataBase.class,"dataBase").build();

    }


    public static App getInstance(){return instance;}

    public MyUserDataBase getMyUserDataBase(){
        return myUserDataBase;
    }

}
