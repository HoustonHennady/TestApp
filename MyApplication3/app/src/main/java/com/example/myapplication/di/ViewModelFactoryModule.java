package com.example.myapplication.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.viewModel.ViewModelProvidersFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory (ViewModelProvidersFactory viewModelProvidersFactory);

    @Provides
    static  ViewModelProvider.Factory bindFactory (ViewModelProvidersFactory factory){
        return factory;
    }
}
