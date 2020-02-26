package com.example.myapplication;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class MyUser {
    @PrimaryKey
    private int id;

    private String name;
    private String adress;


    public MyUser(String name, String adress, int id) {
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

