package com.example.myapplication.ui.Category;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.ui.Category.CategoryViewModel;
import com.example.myapplication.R;
import com.example.myapplication.viewModel.ViewModelProvidersFactory;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class CheckedFragment extends Fragment {

    private CategoryViewModel categoryViewModel;

    @Inject
    ViewModelProvidersFactory viewModelProvidersFactory;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        categoryViewModel = ViewModelProviders.of(this,viewModelProvidersFactory).get(CategoryViewModel.class);

    }

    public CheckedFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_checked, container, false);
        final TextView textView = view.findViewById(R.id.textViewChecked);

        return view;
    }

}
