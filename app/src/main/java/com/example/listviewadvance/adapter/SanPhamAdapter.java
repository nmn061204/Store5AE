package com.example.listviewadvance.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewadvance.R;
import com.example.listviewadvance.model.SanPham;

public class SanPhamAdapter extends ArrayAdapter<SanPham> {
    Activity context;
    int resouce;
    public SanPhamAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resouce=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=this.context.getLayoutInflater();
        View customView=layoutInflater.inflate(this.resouce,null);
        ImageView ivHinh=customView.findViewById(R.id.ivHinh);
        TextView txtTensp=customView.findViewById(R.id.txtTenSP);
        TextView txtSoLuong=customView.findViewById(R.id.txtSoLuong);
        TextView txtDonGia=customView.findViewById(R.id.txtDonGia);
        SanPham sp=getItem(position);
        ivHinh.setImageResource(sp.getHinh());
        txtTensp.setText(sp.getTensp());
        txtSoLuong.setText(sp.getSoluong()+"");
        txtDonGia.setText(sp.getDonggia()+"");
        return customView;
    }
}
