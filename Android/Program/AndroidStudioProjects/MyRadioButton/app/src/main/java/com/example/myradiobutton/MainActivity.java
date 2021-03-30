package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button ShowButton;
    private RadioButton GenderButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioButton);
        ShowButton = findViewById(R.id.ShowButton);
        textView = findViewById(R.id.ShowTextView);

        ShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int SelectedID = radioGroup.getCheckedRadioButtonId();
                //GenderButton = findViewById(SelectedID);
                //String value = GenderButton.getText().toString();

                if(SelectedID==R.id.MaleRadio){
                    textView.setText("Male Selected");
                }else if(SelectedID==R.id.FemaleRadio){
                    textView.setText("Female Selected");
                }
            }
        });
    }
}