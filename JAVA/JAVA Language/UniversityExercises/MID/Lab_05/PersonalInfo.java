package Lab_05;

public abstract class PersonalInfo {
	int id;
    String home_district;
    double height;
    String gender;
    String name;
    String dept;
    double cgpa;
    
    public PersonalInfo(int id,String name,String dept,double cgpa) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
    
	abstract void personalAddress(int id,String home_district,Double height,String gender);
	abstract void academicInfo(int id,String name,String dept,double cgpa);
}
