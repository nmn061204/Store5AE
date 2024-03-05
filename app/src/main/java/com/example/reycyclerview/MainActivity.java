package com.example.reycyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.reycyclerview.adapter.FunctionAdapter;
import com.example.reycyclerview.model.Function;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerViewFunction;
FunctionAdapter functionAdapter;
ArrayList<Function> arr_Function;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        loadData();
    }

    private void loadData() {
        arr_Function.add(new Function(R.drawable.user,"My Infor"));
        arr_Function.add(new Function(R.drawable.noti,"Notification"));
        arr_Function.add(new Function(R.drawable.follow,"Following"));
        arr_Function.add(new Function(R.drawable.heart,"Like"));
        arr_Function.add(new Function(R.drawable.cart,"My Orders"));
        arr_Function.add(new Function(R.drawable.setting,"Setting"));
    }

    private void addControls() {
        recyclerViewFunction= findViewById(R.id.recyclerFunction);
        arr_Function = new ArrayList<>();
        functionAdapter =new FunctionAdapter(this, arr_Function);
        recyclerViewFunction.setAdapter(functionAdapter);
      // GridLayoutManager gridLayoutManager= new GridLayoutManager(this,3);
       // recyclerViewNV.setLayoutManager(new LinearLayoutManager(this));
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerViewFunction.setLayoutManager(staggeredGridLayoutManager);
    }
}