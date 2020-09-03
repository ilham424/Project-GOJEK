package com.example.finalproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AreaFragment extends Fragment {
    private EditText height;
    private EditText width;
    private TextView value;
    private Button calculate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_area, container, false);
        height = v.findViewById(R.id.height);
        width = v.findViewById(R.id.width);
        value = v.findViewById(R.id.TextView_value);
        calculate = v.findViewById(R.id.Button_Calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
        return v;
    }
    //bedanya Double dengan 'd' dan 'D', si 'D' itu digunakan untuk mengubah double ke string atau sebaliknya
    public void calculate(){
        Double Height = Double.parseDouble(height.getText().toString());
        Double Width = Double.parseDouble(width.getText().toString());
        Double area = Height*Width;
        value.setText(area.toString());
    }
}
