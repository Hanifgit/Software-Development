package com.example.myimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.FirstImage);
        imageView2 = findViewById(R.id.SecondImage);

        Handler handler = new Handler();
        imageView1.setOnClickListener(handler);
        imageView2.setOnClickListener(handler);
    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.FirstImage){
                Toast.makeText(MainActivity.this,"Papon",Toast.LENGTH_LONG).show();
            }else if(v.getId()==R.id.SecondImage){
                Toast.makeText(MainActivity.this,"Papon's friends",Toast.LENGTH_LONG).show();
            }
        }
    }
}