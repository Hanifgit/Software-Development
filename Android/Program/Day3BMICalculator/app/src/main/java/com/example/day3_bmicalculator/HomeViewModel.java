package com.example.day3_bmicalculator;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.text.NumberFormat;

public class HomeViewModel extends ViewModel {
    public MutableLiveData<String> bmiString = new MutableLiveData<>();
    public MutableLiveData<String> bmiCondition = new MutableLiveData<>();

    public void CalculateBMI(double weight, double height) {
        double bmiValue = weight/(height*height);
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);

        bmiString.postValue(numberFormat.format(bmiValue));

        String Condition = "";
        if(bmiValue<18.5) Condition = "Underweight";
        else if(bmiValue>=18.5 && bmiValue<25.0) Condition = "Normal";
        else if(bmiValue>=25.0 && bmiValue<30.0) Condition = "Overweight";
        else Condition = "Obese";

        bmiCondition.postValue(Condition);
    }
}
