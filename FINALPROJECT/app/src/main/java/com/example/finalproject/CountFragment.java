package com.example.finalproject;

import android.content.Context;


import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CountFragment extends Fragment {
    private TextView count;
    private Button ButtonMin;
    private Button ButtonReset;
    private Button ButtonMax;
    private int hitung;



    public CountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_count, container, false);
        count = v.findViewById(R.id.TextView_Number);
        ButtonMin = v.findViewById(R.id.Button_Min);
        ButtonReset = v.findViewById(R.id.Button_Reset);
        ButtonMax = v.findViewById(R.id.Button_Plus);

        //Button untuk kurangin
        ButtonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurang();
            }
        });

        //Button untuk reset
        ButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        //Button untuk tambahin
        ButtonMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah();
            }
        });
        return v;

    }
    // inget loh ya semua hal yang ingin ditampilkan itu harus dijadiin string
    public void kurang(){
        hitung--;
        count.setText(Integer.toString(hitung));
    }
    public void tambah(){
        hitung++;
        count.setText(Integer.toString(hitung));
    }
    public void reset(){
        hitung = 0;
        count.setText(Integer.toString(hitung));
    }
    //nih buat sharedpref
//    public void saveCount(){
//        SharedPreferences preferences = getShared
//
//    }

}
