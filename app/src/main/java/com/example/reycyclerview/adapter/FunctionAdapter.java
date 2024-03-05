package com.example.reycyclerview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reycyclerview.R;
import com.example.reycyclerview.model.Function;

import java.util.ArrayList;

public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder>{
    //khai ba0 bien
    Activity context;
    ArrayList<Function> arr_Function;
    public FunctionAdapter(Activity context, ArrayList<Function> arr_Function){
        this.context= context;
        this. arr_Function= arr_Function;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewFunction = layoutInflater.inflate(R.layout.items,parent,false);
        ViewHolder viewHolderFunction= new ViewHolder(viewFunction);
        return viewHolderFunction;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Function nv= arr_Function.get(position);
        holder.ivHinh.setImageResource(nv.getIvHinh());
        holder.txtTenFunction.setText(nv.getTxtTenFunction());


    }

    @Override
    public int getItemCount() {
        return arr_Function.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivHinh;
        TextView txtTenFunction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHinh= itemView.findViewById(R.id.ivHinh);
            txtTenFunction= itemView.findViewById(R.id.txtTenFunction);


        }
    }
}
