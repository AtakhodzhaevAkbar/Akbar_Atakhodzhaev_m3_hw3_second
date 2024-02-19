package com.example.akbar_atakhodzhaev_m3_hw3_second;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


public class MainFragment extends Fragment {
    private RecyclerView rvCars;
    private final ArrayList<String> carsList =new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loaddata();
        ContactAdapter contactAdapter=new ContactAdapter(carsList);
        rvCars.setAdapter(contactAdapter);
    }
    private void initView(){
        rvCars =requireActivity().findViewById(R.id.rv_cars);
    }
    private void loaddata(){
        carsList.add("Nissan");
        carsList.add("Toyota");
        carsList.add("Audi");
        carsList.add("Mitsubishi");
        carsList.add("Mercedes");
        carsList.add("Bmw");
        carsList.add("Volkswagen");
        carsList.add("Jaguar");
        carsList.add("Ford");
        carsList.add("Dodge");
        carsList.add("Chrysler");
        carsList.add("Ferrari");
        carsList.add("Pagani");
    }
}