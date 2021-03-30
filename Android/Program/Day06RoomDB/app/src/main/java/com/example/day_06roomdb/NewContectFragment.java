package com.example.day_06roomdb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_06roomdb.databinding.FragmentNewContectBinding;
import com.example.day_06roomdb.entities.ContactEntity;
import com.example.day_06roomdb.viewmodels.ContactViewModel;

public class NewContectFragment extends Fragment {
    private FragmentNewContectBinding binding;
    private ContactViewModel contactViewModel;
    public NewContectFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentNewContectBinding.inflate(inflater);
       return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contactViewModel = new ViewModelProvider(requireActivity()).get(ContactViewModel.class);
        binding.SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = binding.NameEdit.getText().toString();
                final String email = binding.EmailEdit.getText().toString();
                final String phone = binding.PhoneEdit.getText().toString();
                final ContactEntity contactEntity = new ContactEntity(name,email,phone);
                //save to database

                // Room.databaseBuilder(getActivity(),ContactDB.class,"contact_db").build().getContactDao().insertNewContact(contactEntity);
                //ContactDB.getDb(getActivity()).getContactDao().insertNewContact(contactEntity);
                contactViewModel.addContact(contactEntity);

                Navigation.findNavController(v).navigate(R.id.action_newContectFragment_to_homeFragment);
            }
        });
    }
}