package RakibulAhasanPapon;

import java.util.ArrayList;

public class Students implements BUBT ,Comparable<Students> {
	 int id,session,totalNumberOfCourch;
	 double cgpa;
	 String name,address;
	 
	 final Integer novice = 2021;
	 final Integer junior = 2018;
	 final Integer senior = 2016;
	
	public Students(int id,int session, int totalNumberOfCourch,double cgpa,String name,String address) {
		this.id = id;
		this.session = session;
		this.totalNumberOfCourch = totalNumberOfCourch;
		this.cgpa = cgpa;
		this.name = name;
		this.address = address;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setSession(int session) {
		this.session = session;
	}

	public void setTotalNumberOfCourch(int totalNumberOfCourch) {
		this.totalNumberOfCourch = totalNumberOfCourch;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public int getSession() {
		return session;
	}

	public int getTotalNumberOfCourch() {
		return totalNumberOfCourch;
	}

	public double getCgpa() {
		return cgpa;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public void DisplayInformation() {
		System.out.println("Students Class");
		System.out.println(name);
		System.out.println(address);
		System.out.println(cgpa);
		System.out.println(id);
		System.out.println(session);
		System.out.println(totalNumberOfCourch);
		System.out.println();
	}
	
	@Override
	public int compareTo(Students o) {
		if(this.session==o.session) return 0;
		else if(this.session<o.session) return -1;
		else return 1;
	}

	@Override
	public void CalculateCategories(ArrayList<Integer>students) {
		for(Integer it:students) {
			if(it>=novice) {
				System.out.println("novice student");
			}else if(it>=junior) {
				System.out.println("junior student");
			}else System.out.println("senior student");
	   }
		System.out.println();
	}
}
