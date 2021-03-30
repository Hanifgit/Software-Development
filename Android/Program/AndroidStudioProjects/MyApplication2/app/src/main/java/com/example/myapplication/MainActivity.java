package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_NO_TITLE); //title hide
        //getSupportActionBar().hide();//title bar hide
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //logo enable
        getSupportActionBar().setLogo(R.drawable.ic_web_hi_res_512); //set Logo location
        getSupportActionBar().setDisplayUseLogoEnabled(true); // set logo enable
        getSupportActionBar().setDisplayShowTitleEnabled(true); //show title no/yes
        getSupportActionBar().setTitle("Papon"); //set title

        setContentView(R.layout.activity_main);
    }
}