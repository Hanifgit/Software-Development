package com.example.day4_radiobutton;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day4_radiobutton.Models.EmployeeModels;
import com.example.day4_radiobutton.databinding.FragmentEmployeeDetailsBinding;
import com.example.day4_radiobutton.databinding.FragmentEmployeeListBinding;

public class EmployeeDetailsFragment extends Fragment {
    private FragmentEmployeeDetailsBinding binding;

    public EmployeeDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmployeeDetailsBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EmployeeModels models = (EmployeeModels) getArguments().getSerializable("Employee");
        binding.EmpName.setText(models.getName());
    }
}