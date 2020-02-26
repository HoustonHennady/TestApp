package com.example.myapplication.Fragment.Slide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {

    private List<SlideModel> slideModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public SlideAdapter(List<SlideModel> slideModels, Context context) {
        this.slideModels = slideModels;
        this.context = context;
    }

    @Override
    public int getCount() {
        return slideModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.slide_on_category,container,false);


        TextView textName, textDescriptoion;

        textName = view.findViewById(R.id.textTitleSlide);
        textDescriptoion = view.findViewById(R.id.textDescriptionSlide);


        textName.setText(slideModels.get(position).getName());
        textDescriptoion.setText(slideModels.get(position).getDecription());

        container.addView(view,0);



        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)container);
    }
}
