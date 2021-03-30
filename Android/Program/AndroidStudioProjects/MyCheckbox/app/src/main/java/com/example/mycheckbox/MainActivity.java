package com.example.mycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ShowButton;
    private CheckBox milkCheckbox,sugarCheckbox,waterCheckbox;
    private TextView ViewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckbox = findViewById(R.id.milkCk);
        sugarCheckbox = findViewById(R.id.sugarCk);
        waterCheckbox = findViewById(R.id.waterCk);
        ShowButton = findViewById(R.id.ShowCk);
        ViewText = findViewById(R.id.ViewText);

        ShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(milkCheckbox.isChecked()){
                    String value = milkCheckbox.getText().toString();
                    stringBuilder.append(value+" is ordered"+"\n");
                }
                if(sugarCheckbox.isChecked()){
                    String value = sugarCheckbox.getText().toString();
                    stringBuilder.append(value+" is ordered"+"\n");
                }
                if(waterCheckbox.isChecked()){
                    String value = waterCheckbox.getText().toString();
                    stringBuilder.append(value+" is ordered"+"\n");
                }
                ViewText.setText(stringBuilder);
            }
        });
    }
}