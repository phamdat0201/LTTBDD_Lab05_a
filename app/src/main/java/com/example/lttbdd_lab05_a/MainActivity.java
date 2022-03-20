package com.example.lttbdd_lab05_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDonuts;
    CustomDonutsAdapter adt;
    ArrayList<Donuts> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvDonuts = findViewById(R.id.lvDonuts);

        arrayList = new ArrayList<>();
        arrayList.add(new Donuts(1, "Tasty Donut", "Spicy tasty donut family", 20, R.drawable.donut_yellow_1));
        arrayList.add(new Donuts(2, "Pink Donut", "Spicy tasty donut family", 20, R.drawable.tasty_donut_1));
        arrayList.add(new Donuts(3, "Floating Donut", "Spicy tasty donut family", 20, R.drawable.green_donut_1));
        arrayList.add(new Donuts(4, "Tasty Donut", "Spicy tasty donut family", 20, R.drawable.donut_red_1));

        adt = new CustomDonutsAdapter(this, R.layout.item_listview, arrayList);

        lvDonuts.setAdapter(adt);
    }
}