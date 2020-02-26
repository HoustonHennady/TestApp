package com.example.myapplication.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.Fragment.Slide.SlideAdapter;
import com.example.myapplication.Fragment.Slide.SlideModel;
import com.example.myapplication.R;
import com.example.myapplication.RecyclerCategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class CategoryFragment extends Fragment {

    TextView textView;
    Context context;
    NavController navController;
    SlideAdapter slideAdapter;
    List<SlideModel> slideModels;
    GridView gridView;
    RecyclerCategoryAdapter recyclerCategoryAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("category", "description"));
        slideModels.add(new SlideModel("category1", "description1"));
        slideModels.add(new SlideModel("category2", "description2"));
        slideModels.add(new SlideModel("category3", "description3"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_category, container, false);

        ViewPager viewPager = view.findViewById(R.id.viewPagerCat);

        recyclerCategoryAdapter = new RecyclerCategoryAdapter(getContext(), getdata());

        gridView = view.findViewById(R.id.gridView);
        gridView.setVerticalScrollBarEnabled(false);
        gridView.setAdapter(recyclerCategoryAdapter);
        gridView.setOnItemClickListener(onItemClickListener);

        slideAdapter = new SlideAdapter(slideModels, getContext());
        viewPager.setAdapter(slideAdapter);
         /*   LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
            recyclerView = view.findViewById(R.id.Recycler_category);
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerCategoryAdapter11 recyclerCategoryAdapter = new RecyclerCategoryAdapter11(lists, getContext());
            recyclerView.setAdapter(recyclerCategoryAdapter);
            */
        return view;
    }

    private GridView.OnItemClickListener onItemClickListener = new GridView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Navigation.findNavController(view).navigate(R.id.secondCategoryFragment);
        }
    };


    public ArrayList<String> getdata() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Category1");
        list.add("Category2");
        list.add("Category3");
        list.add("Category4");
        list.add("Category5");
        list.add("Category6");
        list.add("Category7");
        list.add("Category8");
        list.add("Category9");
        list.add("Category10");
        list.add("Category11");
        return list;
    }

    public CategoryFragment() {
    }
}

