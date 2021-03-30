package com.example.day_06roomdb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.day_06roomdb.databinding.FragmentContactDetailsBinding;
import com.example.day_06roomdb.entities.ContactEntity;
import com.example.day_06roomdb.viewmodels.ContactViewModel;

public class ContactDetailsFragment extends Fragment {
    private ContactViewModel contactViewModel;
    private FragmentContactDetailsBinding binding;
    public ContactDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        contactViewModel = new ViewModelProvider(requireActivity()).get(ContactViewModel.class);
        binding = FragmentContactDetailsBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Bundle bundle = getArguments();
        if(bundle!=null){
            final long id = bundle.getLong("id");
            contactViewModel.fetchContactsByID(id).observe(getViewLifecycleOwner(), new Observer<ContactEntity>() {
                @Override
                public void onChanged(ContactEntity contactEntity) {
                    binding.detailsName.setText(contactEntity.getName());
                    binding.detailsEmail.setText(contactEntity.getEmail());
                    binding.detailsPhone.setText(contactEntity.getPhone());
                }
            });
            binding.callBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(),"Coming soon",Toast.LENGTH_LONG).show();
                    Navigation.findNavController(v).navigate(R.id.homeFragment);
                }
            });
            binding.smsBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(),"Coming soon",Toast.LENGTH_LONG).show();
                }
            });
            binding.emailBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(),"Coming soon",Toast.LENGTH_LONG).show();
                }
            });

        }
    }
}