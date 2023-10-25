package com.example.recycleview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview2.Models.Carro;
import com.example.recycleview2.adapters.CarroAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Carro> ListadeCarros = new ArrayList<>();
        ListadeCarros.add(new Carro("Rojo", "Ferrari"));
        ListadeCarros.add(new Carro("Verde", "BMW"));

        CarroAdapter ca = new CarroAdapter(ListadeCarros);
        RecyclerView rv = findViewById(R.id.rccarro);

        rv.setAdapter(ca);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}