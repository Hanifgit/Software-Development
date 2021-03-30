package RakibulAhasanPapon;

import java.util.ArrayList;

public class Staff implements BUBT,Comparable<Staff>{
    String name,address,contact,department;
	double salary;
	int joiningDate;
	String designation;
	
	final Integer novice = 2021;
	final Integer junior = 2018;
	final Integer senior = 2016;
	
	public Staff(String name,String address,String contact,String department,int joiningDate,double salary,
	    String designation) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.department = department;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.designation = designation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setJoiningDate(int joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

	public String getDepartment() {
		return department;
	}

	public int getJoiningDate() {
		return joiningDate;
	}

	@Override
	public void DisplayInformation() {
		System.out.println("Staff Class");
		System.out.println(name);
		System.out.println(address);
		System.out.println(contact);
		System.out.println(department);
		System.out.println(joiningDate);
		System.out.println(salary);
		System.out.println(designation);
		System.out.println();
	}

	@Override
	public int compareTo(Staff o) {
		if(this.joiningDate==o.joiningDate) return 0;
		else if(this.joiningDate<o.joiningDate) return -1;
		else return 1;
	}
	
	@Override
	public void CalculateCategories(ArrayList<Integer>Staff) {
		for(Integer it:Staff) {
			if(it>=Integer.valueOf(novice)) {
				System.out.println("novice Staff");
			}else if(it>=junior) {
				System.out.println("junior Staff");
			}else System.out.println("senior Staff");
	    }
		System.out.println();
	}
	
}
