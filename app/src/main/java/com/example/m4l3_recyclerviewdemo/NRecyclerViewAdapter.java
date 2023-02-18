package com.example.m4l3_recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NRecyclerViewAdapter extends RecyclerView.Adapter<NRecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<NumberModel> numberModels;

    public NRecyclerViewAdapter(Context context, ArrayList<NumberModel> numberModels) {
        this.context = context;
        this.numberModels = numberModels;
    }

    @NonNull
    @Override
    public NRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // This is where you inflate the layout (Giving a look to our rows)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new NRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NRecyclerViewAdapter.MyViewHolder holder, int position) {
        // assigning values to the views we created in the recycler_view_row layout file
        // based on the position of the recycler view
        holder.tvName.setText(numberModels.get(position).getNumberName());
        holder.tvSign.setText(numberModels.get(position).getNumberSign());
        holder.tvLetter.setText(numberModels.get(position).getNumberLetter());
        holder.imageView.setImageResource(numberModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        // the recycler view wants to know the number of items you want displayed
        return numberModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // grabbing the views from our recycler_view_row layout file
        // Like in the onCreate method
        ImageView imageView;
        TextView tvName;
        TextView tvSign;
        TextView tvLetter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tvSign = itemView.findViewById(R.id.tvSign);
            tvLetter = itemView.findViewById(R.id.tvLetter);
        }
    }
}
