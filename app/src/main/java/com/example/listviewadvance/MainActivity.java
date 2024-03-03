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
        sanPhamAdapter.add(new SanPham(R.drawable.anh1,"dangosister",10,300.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh2,"Another TWEE",20,520.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh3,"Wonderwonder",30,530.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh4,"Couple",40,900.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh5,"byclothes",50,102.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh6,"girtbiuty",20,450.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh7,"ccomeng",80,100.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh8,"thegirl",80,200.000));
        sanPhamAdapter.add(new SanPham(R.drawable.anh9,"Hey lady",80,700.000));

    }

    private void addControls() {
        lvSanPham=findViewById(R.id.lvSanPham);
        sanPhamAdapter=new SanPhamAdapter(this,R.layout.items);
        lvSanPham.setAdapter(sanPhamAdapter);
    }
}