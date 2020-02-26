package com.example.myapplication.di.Category;

import androidx.lifecycle.ViewModel;

import com.example.myapplication.di.ViewModelKey;
import com.example.myapplication.ui.Category.CategoryViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class CategoryViewModleModule {

    @Binds
    @IntoMap
    @ViewModelKey(CategoryViewModel.class)
    public abstract ViewModel bindCategoryViewModel (CategoryViewModel categoryViewModel);
}
