package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerView);
        ArrayList<model> list=new ArrayList<>();
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));
        list.add(new model("dateme",R.drawable.amazon));

        adapter adapter = new adapter(list,getApplicationContext());
        recycler.setAdapter(adapter);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recycler.setLayoutManager(manager);
    }
}