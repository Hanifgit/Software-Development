package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstText,secondText;
    private Button AddBtn,SubBtn;
    private TextView TextSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstText = findViewById(R.id.EditTestFirst);
        secondText = findViewById(R.id.EditTestSecond);
        AddBtn = findViewById(R.id.add_Text);
        SubBtn = findViewById(R.id.Sub_Text);
        TextSum = findViewById(R.id.TextSum);

        Handler handler = new Handler();
        firstText.setOnClickListener(handler);
        secondText.setOnClickListener(handler);
        AddBtn.setOnClickListener(handler);
        SubBtn.setOnClickListener(handler);
        TextSum.setOnClickListener(handler);
    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            try {
                Double number1 = Double.parseDouble(firstText.getText().toString());
                Double number2 = Double.parseDouble(secondText.getText().toString());
                if(v.getId()==R.id.add_Text){
                    double Sum = number1+ number2;
                    TextSum.setText("Sum is : "+Sum);
                }else if(v.getId()==R.id.Sub_Text){
                    double Sub = number1+ number2;
                    TextSum.setText("Sum is : "+Sub);
                }
            }catch (Exception e){
                Toast.makeText(MainActivity.this,"Please Enter a Number",Toast.LENGTH_LONG).show();
            }
        }
    }
}