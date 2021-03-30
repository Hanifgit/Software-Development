package com.example.day4_radiobutton.DB;

import com.example.day4_radiobutton.Models.EmployeeModels;

import java.util.ArrayList;
import java.util.List;

public class TMdb {
    public static List<EmployeeModels>employeeModelsList;

    static {
        employeeModelsList = new ArrayList<>();
        employeeModelsList.add(new EmployeeModels("Abc",27,"Monthly Salary Employee","January 01,1992","Male"));
        employeeModelsList.add(new EmployeeModels("DEF",25,"Monthly Selary Employee","January 05,1999","Female"));
        employeeModelsList.add(new EmployeeModels("Abc",27,"Monthly Salary Employee","January 01,1992","Male"));
        employeeModelsList.add(new EmployeeModels("DEF",25,"Monthly Selary Employee","January 05,1999","Female"));
        employeeModelsList.add(new EmployeeModels("Abc",27,"Monthly Salary Employee","January 01,1992","Male"));
        employeeModelsList.add(new EmployeeModels("DEF",25,"Monthly Selary Employee","January 05,1999","Female"));
        employeeModelsList.add(new EmployeeModels("Abc",27,"Monthly Salary Employee","January 01,1992","Male"));
        employeeModelsList.add(new EmployeeModels("DEF",25,"Monthly Selary Employee","January 05,1999","Female"));
        employeeModelsList.add(new EmployeeModels("Abc",27,"Monthly Salary Employee","January 01,1992","Male"));
        employeeModelsList.add(new EmployeeModels("DEF",25,"Monthly Selary Employee","January 05,1999","Female"));
    }
}
