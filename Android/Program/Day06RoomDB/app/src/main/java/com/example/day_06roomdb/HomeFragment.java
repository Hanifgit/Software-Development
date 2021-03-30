package com.example.day_06roomdb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_06roomdb.adapters.ContactAdapter;
import com.example.day_06roomdb.databinding.FragmentHomeBinding;
import com.example.day_06roomdb.entities.ContactEntity;
import com.example.day_06roomdb.viewmodels.ContactViewModel;

import java.util.List;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private ContactViewModel contactViewModel;
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
        contactViewModel = new ViewModelProvider(requireActivity()).get(ContactViewModel.class);
        contactViewModel.fetchAllContacts().observe(getViewLifecycleOwner(), new Observer<List<ContactEntity>>() {
            @Override
            public void onChanged(List<ContactEntity> contactEntities) {
                final ContactAdapter adapter = new ContactAdapter(getActivity(),contactEntities,contactViewModel);
                binding.contectrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                binding.contectrecyclerView.setAdapter(adapter);
            }
        });

        binding.addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_newContectFragment);
            }
        });
    }
}