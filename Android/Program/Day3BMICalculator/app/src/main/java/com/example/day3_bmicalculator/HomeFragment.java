package com.example.day3_bmicalculator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day3_bmicalculator.databinding.FragmentHomeBinding;

import java.text.NumberFormat;

public class HomeFragment extends Fragment {
    //Data Binding
    private FragmentHomeBinding binding;
    private HomeViewModel homeViewModel;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        homeViewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        //SetDate();
        homeViewModel.bmiString.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.ResultText.setText(s);
            }
        });

        homeViewModel.bmiCondition.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.StatesText.setText(s);
            }
        });

        binding.SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Weight = binding.weightET.getText().toString();
                String Height = binding.heightET.getText().toString();
                if(Weight.isEmpty() ){
                    binding.weightET.setError("Provide a valid weight");
                    return;
                }
                if(Height.isEmpty()){
                    binding.heightET.setError("Provide a valid height");
                    return;
                }
                final double weight = Double.parseDouble(Weight);
                final double height = Double.parseDouble(Height);
                homeViewModel.CalculateBMI(weight,height);
               // SetDate();
            }
        });
    }

    /*private void SetDate(){
        binding.ResultText.setText(homeViewModel.bmiString);
        binding.StatesText.setText(homeViewModel.bmiCondition);
    }*/
}