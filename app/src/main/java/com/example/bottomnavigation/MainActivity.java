package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

     BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.navigation);

       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()) {

                   case R.id.home:
                       getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new home()).commit();
                       break;

                   case R.id.history:
                       getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new history()).commit();
                       break;

                   case R.id.profile:
                       getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new profile()).commit();
                       break;


               }
               return false;


            }
        });
    }
}