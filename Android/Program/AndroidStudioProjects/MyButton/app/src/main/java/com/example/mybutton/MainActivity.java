package com.example.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button LoginBtn,LogoutBtn;
    private TextView LoginTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginBtn = findViewById(R.id.LoginID);
        LogoutBtn = findViewById(R.id.LogoutID);
        LoginTxt = findViewById(R.id.TextListener);

        //First Way Listener
        /*LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginTxt.setText("Login Successfully!!");
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginTxt.setText("Logout Successfully!!");
            }
        });*/

        //Second Way Listener(implements View.OnClickListener(onClick Method Override)
        /*LoginBtn.setOnClickListener(this::onClick);
        LogoutBtn.setOnClickListener(this::onClick);*/

        //Third Way Listener
        /*Handler handler = new Handler();
        LoginBtn.setOnClickListener(handler);
        LogoutBtn.setOnClickListener(handler);*/
    }

    @Override
    public void onClick(View v) {
         if(v.getId()==R.id.LoginID){
             LoginTxt.setText("Login Successfully!!");
         }else if(v.getId()==R.id.LogoutID){
             LoginTxt.setText("Logout Successfully!!");
         }
    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.LoginID){
                LoginTxt.setText("Login Successfully!!");
            }else if(v.getId()==R.id.LogoutID){
                LoginTxt.setText("Logout Successfully!!");
            }
        }
    }

    //Fourth Way Listener(android:onClick -> activity_main.xml)
    public void showMessage(View e){
        if(e.getId()==R.id.LoginID){
            //LoginTxt.setText("Login Successfully!!");

            Toast.makeText(MainActivity.this,"Login Button is Clicked",Toast.LENGTH_LONG).show();
        }else if(e.getId()==R.id.LogoutID){
            //LoginTxt.setText("Logout Successfully!!");

            Toast toast = Toast.makeText(MainActivity.this,"Logout Button is Clicked",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,90,45);
            toast.show();
        }
    }
}