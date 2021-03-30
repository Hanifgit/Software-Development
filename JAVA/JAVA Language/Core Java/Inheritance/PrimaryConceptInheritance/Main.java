package PrimaryConceptInheritance;
/*Inheritance can be define as the process where one class acquires the
properties(methods and fields) of another
*Single,Multilevel,Hierarchical,Multiple;
*/
public class Main {
	public static void main(String[] args) {
		Person objPerson = new Person();
		objPerson.setName("Papon Ahsan");
		objPerson.setAge(24);
		objPerson.Display1();
		//System.out.println(objPerson.getName());
		//System.out.println(objPerson.getAge());
		
		Teacher objTeacher = new Teacher();
		objTeacher.setName("Rakibul Ahasan");
		objTeacher.setAge(23);
		objTeacher.setQualification("Bsc in CSE");
		objTeacher.Display2();
		//System.out.println(objTeacher.getName());
		//System.out.println(objTeacher.getAge());
		//System.out.println(objTeacher.getQualification());
	}
}
