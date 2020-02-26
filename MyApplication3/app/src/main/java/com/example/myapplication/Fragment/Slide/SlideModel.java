package com.example.myapplication.Fragment.Slide;

import android.media.Image;

public class SlideModel {


    private String name;
    private String description;


 public SlideModel(String name, String decription) {
     this.name = name;
     this.description = decription;

 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return description;
    }

    public void setDecription(String decription) {
        this.description = decription;
    }




}
