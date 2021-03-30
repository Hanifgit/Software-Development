package com.example.day_06roomdb.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day_06roomdb.ContactDB;
import com.example.day_06roomdb.R;
import com.example.day_06roomdb.entities.ContactEntity;
import com.example.day_06roomdb.viewmodels.ContactViewModel;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private Context context;
    private List<ContactEntity>contactEntityList;
    private ContactViewModel contactViewModel;

    public ContactAdapter(Context context, List<ContactEntity> contactEntityList,ContactViewModel contactViewModel) {
        this.context = context;
        this.contactEntityList = contactEntityList;
        this.contactViewModel = contactViewModel;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.nameTV.setText(contactEntityList.get(position).getName());
        holder.menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUpMenu(position,holder.menuBtn);
            }
        });
    }

    private void showPopUpMenu(int position, ImageButton menuBtn) {
        final PopupMenu popupMenu = new PopupMenu(context,menuBtn);
        popupMenu.getMenuInflater().inflate(R.menu.row_menu,popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_details:
                        final Bundle bundle = new Bundle();
                        bundle.putLong("id",contactEntityList.get(position).getId());
                        Navigation.findNavController(menuBtn)
                                .navigate(R.id.action_homeFragment_to_contactDetailsFragment,bundle);
                        break;
                    case R.id.item_edit:

                        break;
                    case R.id.item_delete:
                        showDeleteConfirmationDialog(position);
                        break;
                }
                return false;
            }
        });
    }

    private void showDeleteConfirmationDialog(int position) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.ic_baseline_delete_24);
        builder.setTitle("Confirm Delete");
        builder.setMessage("Are you sure to delete this contact?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final ContactEntity contactEntity = contactEntityList.get(position);
                contactViewModel.removeContact(contactEntity);
            }
        });
        builder.setNegativeButton("Cancel",null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public int getItemCount() {
        return contactEntityList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{
        TextView nameTV;
        ImageButton menuBtn;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.row_name);
            menuBtn = itemView.findViewById(R.id.row_menuBtn);
        }
    }
}
