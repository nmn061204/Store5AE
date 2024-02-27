package com.example.listviewadvance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.listviewadvance.adapter.SanPhamAdapter;
import com.example.listviewadvance.model.SanPham;

public class MainActivity extends AppCompatActivity {
ListView lvSanPham;
SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        loadData();
        addEvents();
    }

    private void addEvents() {
        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SanPham sp=sanPhamAdapter.getItem(position);
                Intent intent=new Intent(MainActivity.this,ChitietActivity.class);
                intent.putExtra("sp",sp);
                startActivity(intent);
            }
        });
    }

    private void loadData() {
        sanPhamAdapter.add(new SanPham(R.drawable.meo3,"Hình meo 1",10,5000));
        sanPhamAdapter.add(new SanPham(R.drawable.sp1,"Hình meo 2",20,52000));
        sanPhamAdapter.add(new SanPham(R.drawable.meo4,"Hình meo 3",30,53000));
        sanPhamAdapter.add(new SanPham(R.drawable.sp3,"Hình meo 4",40,5040));
        sanPhamAdapter.add(new SanPham(R.drawable.meo5,"Hình meo 5",50,50100));
        sanPhamAdapter.add(new SanPham(R.drawable.meo3,"Hình meo 6",20,2000));
        sanPhamAdapter.add(new SanPham(R.drawable.meo3,"Hình meo 7",80,10000));

    }

    private void addControls() {
        lvSanPham=findViewById(R.id.lvSanPham);
        sanPhamAdapter=new SanPhamAdapter(this,R.layout.items);
        lvSanPham.setAdapter(sanPhamAdapter);
    }
}