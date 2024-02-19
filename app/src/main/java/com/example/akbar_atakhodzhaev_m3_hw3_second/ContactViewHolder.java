package com.example.akbar_atakhodzhaev_m3_hw3_second;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvCars;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCars= itemView.findViewById(R.id.tv_cars);
    }
    public void onBind(String contact){
        tvCars.setText(contact);
    }
}
