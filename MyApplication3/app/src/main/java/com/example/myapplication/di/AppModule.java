package com.example.myapplication.di;

import android.app.Activity;
import android.app.Application;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public class AppModule {
    @Provides
    static String messege (){

        String messeg = "chrbrvbruvhru";
        return messeg;
    }


    @Provides
    static NavController getNavController (Activity activity){
        NavController navController = Navigation.findNavController(activity,R.id.navHost);
        return navController;

    }
    @Provides
    static boolean getApp (Application application){return application == null;}




}
