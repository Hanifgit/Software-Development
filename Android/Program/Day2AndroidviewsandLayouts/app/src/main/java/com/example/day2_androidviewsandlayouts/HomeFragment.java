package com.example.day2_androidviewsandlayouts;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.SecureRandom;

public class HomeFragment extends Fragment {
    private ImageView imageView,imageView2;
    private Button button,button1;
    private SecureRandom secureRandom;
    private TextView textView,textView1;
    private final int[] dices = {
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3,
            R.drawable.d4,
            R.drawable.d5,
            R.drawable.d6
    };

    int index1 = 0,index2 = 0;
    int score = 0,EndScore = -1;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        secureRandom = new SecureRandom();
       // index = secureRandom.nextInt(6);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.resultText);
        textView1 = view.findViewById(R.id.HeightResult);
        imageView = view.findViewById(R.id.DiceImageID);
        imageView2 = view.findViewById(R.id.DiceImageID2);
        button = view.findViewById(R.id.DiceButton);
        button1 = view.findViewById(R.id.DiceStart);

        //imageView.setImageResource(R.drawable.d1);
       // imageView.setImageResource(dices[index]);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(true);
                button1.setEnabled(false);
                imageView.setImageResource(R.mipmap.ic_launcher_round);
                imageView2.setImageResource(R.mipmap.ic_launcher_round);
                //generateAndSetDice();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAndSetDice();
            }
        });
    }

    public void generateAndSetDice(){
        index1 = secureRandom.nextInt(6);
        imageView.setImageResource(dices[index1]);
        index2 = secureRandom.nextInt(6);
        imageView2.setImageResource(dices[index2]);

        if(index1+index2+2==7){
            Toast.makeText(getActivity(), "End Game", Toast.LENGTH_LONG).show();
            button.setEnabled(false);
            button1.setEnabled(true);

            //imageView.setImageResource(R.mipmap.ic_launcher_round);
            //imageView2.setImageResource(R.mipmap.ic_launcher_round);
            if(score>EndScore){
               textView1.setText("Height Result is : "+score);
               EndScore = score;
            }
            score = index1 = index2 = 0;

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            return;
        }

        score+=index1+index2+2;
        textView.setText("Your Score is : "+ score);
    }
}