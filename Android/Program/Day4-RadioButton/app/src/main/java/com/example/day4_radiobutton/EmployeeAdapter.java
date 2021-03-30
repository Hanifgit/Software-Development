package com.example.day4_radiobutton;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day4_radiobutton.Models.EmployeeModels;

import java.util.List;

// Step 1.inflates Layout
//Step 2.View Initialization
//Step 3.Data Set

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    private Context context;
    private List<EmployeeModels>employeeModels;

    public EmployeeAdapter(Context context, List<EmployeeModels> employeeModels) {
        this.context = context;
        this.employeeModels = employeeModels;
    }

    // Step 1.inflates Layout
    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.emp_row,parent,false);
        return new EmployeeViewHolder(itemView);
    }

    //Step 3.Data Set
    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        holder.nameTV.setText(employeeModels.get(position).getName());
        holder.typeTV.setText(employeeModels.get(position).getEmpType());

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, employeeModels.get(position).getName(), Toast.LENGTH_SHORT).show();
                final Bundle bundle = new Bundle();
                bundle.putSerializable("Employee",employeeModels.get(position));

                Navigation.findNavController(v).navigate(R.id.employeeDetailsFragment,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return employeeModels.size();
    }

    //Step 2.View Initialization
    class EmployeeViewHolder extends RecyclerView.ViewHolder{
        TextView nameTV,typeTV;
        ImageButton imageButton;
        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.NameID);
            typeTV = itemView.findViewById(R.id.TypeID);
            imageButton = itemView.findViewById(R.id.RowMenuButton);
        }
    }
}
