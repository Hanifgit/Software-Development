package com.example.day4_radiobutton;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.day4_radiobutton.DB.TMdb;
import com.example.day4_radiobutton.Models.EmployeeModels;
import com.example.day4_radiobutton.databinding.FragmentHomeBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private String gender = "Male";
    private String DoB = "";
    private String empType = "";

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

        binding.genderMF.setOnCheckedChangeListener((group, checkedId) -> {
            final RadioButton rb = group.findViewById(checkedId);
            gender = rb.getText().toString();
        });

        binding.DatePickerButton.setOnClickListener(v -> {
            DatePickerDialog pickerDialog =
                    new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            //binding.DatePickerButton.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                            final SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd,yyyy");
                            //DoB = dateFormat.format(new Date()); //today date
                            Date date = new GregorianCalendar(year,month,dayOfMonth).getTime();
                            DoB = dateFormat.format(date);
                            binding.DatePickerButton.setText(DoB);
                        }
                    }, 2000, 10, 24);

            pickerDialog.show();
        });

        //Create Adapter(collection+view)
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (getActivity(),android.R.layout.simple_spinner_dropdown_item,EmployeeUtils.empCatList);
        //Adapter add to Spinner
        binding.spinnerID.setAdapter(adapter);

        binding.spinnerID.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                empType = EmployeeUtils.empCatList.get(position);
                Toast.makeText(getContext(),empType,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        binding.SaveButton.setOnClickListener(v -> {
            final String name = binding.nameInputET.getText().toString();
            final String age = binding.ageInputET.getText().toString();

            final EmployeeModels models = new EmployeeModels(name,Integer.parseInt(age),empType,DoB,gender);
            TMdb.employeeModelsList.add(models);
            Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_employeeListFragment);
        });
    }
}