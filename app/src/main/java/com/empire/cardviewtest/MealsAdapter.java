package com.empire.cardviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 20.03.2015.
 */
public class MealsAdapter extends RecyclerView.Adapter<MealsAdapter.ViewHolder> {
    List<MealsEntity> mealsEntities;

    public MealsAdapter(){
        super();
        mealsEntities = new ArrayList<MealsEntity>();
        MealsEntity meals = new MealsEntity();
        meals.setText("povelete");
        meals.setImage(R.drawable.salmon);
        mealsEntities.add(meals);

        meals = new MealsEntity();
        meals.setText("probajte");
        meals.setImage(R.drawable.carbonara1);
        mealsEntities.add(meals);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    MealsEntity meals = mealsEntities.get(position);
        holder.textView.setText(meals.getText());
        holder.imageView.setImageResource(meals.getImage());
    }

    @Override
    public int getItemCount() {
        return mealsEntities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView =(ImageView)itemView.findViewById(R.id.image_1);
            textView = (TextView)itemView.findViewById(R.id.text_1);
        }
    }
}
