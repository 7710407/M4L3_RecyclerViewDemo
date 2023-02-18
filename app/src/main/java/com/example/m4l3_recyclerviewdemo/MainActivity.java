package com.example.m4l3_recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<NumberModel> numberModels = new ArrayList<>();
    int[] numberImages = {
            R.drawable.baseline_filter_1_24,
            R.drawable.baseline_filter_2_24,
            R.drawable.baseline_filter_3_24,
            R.drawable.baseline_filter_4_24,
            R.drawable.baseline_filter_5_24,
            R.drawable.baseline_filter_6_24,
            R.drawable.baseline_filter_7_24,
            R.drawable.baseline_filter_8_24,
            R.drawable.baseline_filter_9_24,
            R.drawable.baseline_filter_9_plus_24
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        setUpNumberOneModels();
        NRecyclerViewAdapter adapter = new NRecyclerViewAdapter(this, numberModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpNumberOneModels() {
        String[] numberNames = getResources().getStringArray(R.array.filters);
        String[] numberSigns = getResources().getStringArray(R.array.filters_sign);
        String[] numberLetters = getResources().getStringArray(R.array.filters_letter);

        for(int i = 0; i < numberNames.length; ++i) {
            numberModels.add(new NumberModel(numberNames[i], numberSigns[i], numberLetters[i],
                    numberImages[i]));
        }
    }
}