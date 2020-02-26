package com.example.myapplication.di;

import com.example.myapplication.MainActivity;
import com.example.myapplication.di.Category.CategoryViewModleModule;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = {CategoryViewModleModule.class})
    abstract MainActivity mainActivity();


}
