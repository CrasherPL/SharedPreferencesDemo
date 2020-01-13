package com.example.studentwsb.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences =
                this.getSharedPreferences("com.example.studentwsb.sharedpreferencesdemo", Context.MODE_PRIVATE);

       //Zapisanie
//        sharedPreferences.edit().putString("imie","Michal").apply();

       //Odczytanie
        String name = sharedPreferences.getString("imie", "");
        Log.i("imie", name);
    }
}
