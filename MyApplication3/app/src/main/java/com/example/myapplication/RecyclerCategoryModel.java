package com.example.myapplication;

import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerCategoryModel {

    ArrayList<String> category;
    public RecyclerCategoryModel(){ }
    public RecyclerCategoryModel(ArrayList<String> category) {
        this.category = category;
    }
    public ArrayList<String> getCategory() {
        return category;
    }
    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }
}
