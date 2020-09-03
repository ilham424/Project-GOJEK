package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new CountFragment()).commit();

    }

    BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment =null;
            switch (item.getItemId()) {
                case R.id.icon_reset:
                    fragment = new CountFragment();
                    break;
                case R.id.icon_Area:
                    fragment = new AreaFragment();
                    break;
                case R.id.icon_Volume:
                    fragment = new VolumeFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
            return true;
        }
    };
}
