package com.example.day4_radiobutton;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.day4_radiobutton.DB.TMdb;
import com.example.day4_radiobutton.databinding.FragmentEmployeeListBinding;

public class EmployeeListFragment extends Fragment {

    private FragmentEmployeeListBinding Binding;
    private EmployeeAdapter adapter;

    public EmployeeListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Binding = FragmentEmployeeListBinding.inflate(inflater);
        return Binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new EmployeeAdapter(getActivity(), TMdb.employeeModelsList);
        final LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        //manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //final GridLayoutManager manager1 = new GridLayoutManager(getActivity(),2);
        //final StaggeredGridLayoutManager manager2 = new StaggeredGridLayoutManager();
        Binding.EmpyListID.setLayoutManager(manager);
        Binding.EmpyListID.setAdapter(adapter);

        Binding.fabID.setOnClickListener((v)->{
            Navigation.findNavController(v).navigate(R.id.action_employeeListFragment_to_homeFragment);
        });
    }
}