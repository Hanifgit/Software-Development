package RakibulAhasanPapon;

import java.util.ArrayList;
import java.util.Collections;

public class TestClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Faculty facultyObj1 = new Faculty("Karim", "Mirpur-1", "01741885987", "CSE", 2018, 40000, "Lecturer");
		facultyObj1.DisplayInformation();
		Faculty facultyObj2 = new Faculty("Rarim", "Mirpur-2", "01741235912", "CSE", 2019, 50000, "Lecturer");
		Faculty facultyObj3 = new Faculty("Iarim", "Mirpur-3", "01741475978", "CSE", 2020, 30000, "Lecturer");
		
		ArrayList<Integer>facultys = new ArrayList<>();
		facultys.add(2018);
		facultys.add(2020);
		facultys.add(2019);
		Collections.sort(facultys);
		
		facultyObj1.CalculateCategories(facultys);
		
		Staff StaffObj1 = new Staff("Karim", "Mirpur-1", "01741235912", "CSE", 2018, 20000, "Lecturer");
		StaffObj1.DisplayInformation();
		StaffObj1.setContact("01741235912");
		StaffObj1.setDepartment("CSE");;
		StaffObj1.setJoiningDate(2018);;
		StaffObj1.setSalary(20000);
		StaffObj1.setName("Hanif");
		StaffObj1.setAddress("Mirpur-1");
		Staff StaffObj2 = new Staff("Rahim", "Mirpur-3", "01812885937", "CSE", 2021, 10000, "Lecturer");
		Staff StaffObj3 = new Staff("Imran", "Mirpur-2", "01122825937", "EEE", 2011, 30000, "Lecturer");
		
		ArrayList<Integer>staffs = new ArrayList<>();
		staffs.add(2018);
		staffs.add(2021);
		staffs.add(2012);
		Collections.sort(staffs);
		StaffObj2.CalculateCategories(staffs);
		
		Students StudentsObj1 = new Students(22, 2018, 2, 3.45, "Hanif", "Mirpur-1");
		StudentsObj1.DisplayInformation();
        StudentsObj1.setId(22);
        StudentsObj1.setSession(2018);
        StudentsObj1.setTotalNumberOfCourch(2);
        StudentsObj1.setCgpa(3.45);
        StudentsObj1.setName("Papon");
        StudentsObj1.setAddress("Mirpur-1");
        
		Students StudentsObj2 = new Students(24, 2019, 3, 3.23, "Karim", "Mirpur-2");
		Students StudentsObj3 = new Students(28, 2020, 4, 3.15, "Rahim", "Mirpur-3");
		
		ArrayList<Integer>students = new ArrayList<>();
		students.add(2022);
		students.add(2018);
		students.add(2015);
		Collections.sort(students);
		
		StudentsObj1.CalculateCategories(students);

	}

}
