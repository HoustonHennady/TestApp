package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerCategoryAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> list;

    public RecyclerCategoryAdapter(Context context, ArrayList<String> category) {
        this.list = category;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.indexOf(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.item_recycler_category, parent, false);
        TextView textView = view.findViewById(R.id.textviewrecyclercategory);
        textView.setText(getItem(position).toString());
        return view;
    }
}


