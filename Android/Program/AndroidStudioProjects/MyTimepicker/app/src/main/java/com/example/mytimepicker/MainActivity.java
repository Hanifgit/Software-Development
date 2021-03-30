package com.example.mytimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.TimePickerID);
        timePicker.setIs24HourView(false);
        button = findViewById(R.id.ButtonID);
        textView = findViewById(R.id.TextViewID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = timePicker.getCurrentHour()-12;

                String time = hour+":"+ timePicker.getCurrentMinute();
                textView.setText(time);
            }
        });
    }
}