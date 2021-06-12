package com.moin.recyclerview_191118;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moin.recyclerview_191118.Adapter.RecyclerViewAdapter;
import com.moin.recyclerview_191118.Model.Flight;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Flight> flightList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flightList.add(new Flight("Karachi", "Islamabad"));
        flightList.add(new Flight("Islamabad","Karachi"));
        flightList.add(new Flight("Islamabad","Lahore"));
        flightList.add(new Flight("Lahore","Islamabad"));
        flightList.add(new Flight("Lahore","Karachi"));
        flightList.add(new Flight("Karachi","Lahore"));

        recyclerViewAdapter = new RecyclerViewAdapter(this,flightList);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}