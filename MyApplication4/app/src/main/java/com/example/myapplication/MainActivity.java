package com.example.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fortext fortext = new Fortext("gena",null);
        ActivityMainBinding mainActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainActivityBinding.setFortext(fortext);
    }
}
