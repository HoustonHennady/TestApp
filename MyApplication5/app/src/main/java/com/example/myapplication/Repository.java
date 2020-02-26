package com.example.myapplication;

import android.databinding.ObservableField;
import android.view.View;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Observable;

public abstract class   Repository  {


    MyUserDataBase myUserDataBase = App.getInstance().getMyUserDataBase();
    UesrDao uesrDao = myUserDataBase.uesrDao();





    public  void bindingToBase(String nameToInsert, String adressToInsert){
        MyUser myUser = new MyUser(nameToInsert,adressToInsert,1);
        uesrDao.addUser(myUser);
    }

    public void getUsers(){
        MyUser myUser = uesrDao.getUserById(1);



        String name = myUser.getName();
        String adress = myUser.getAdress();



    }


}
