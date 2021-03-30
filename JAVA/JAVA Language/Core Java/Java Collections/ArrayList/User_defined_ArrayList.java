package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class User_defined_ArrayList {
	
	class Student {
		int rollno;
		String name;
		int age;

		Student(int rollno, String name, int age) {
			this.rollno = rollno;
			this.name = name;
			this.age = age;
		}
	}
	
	public static void main(String args[]){ 
		 //Creating Outer user-defined class objects 
		  User_defined_ArrayList obj = new User_defined_ArrayList();
		  
		  //Creating Inner user-defined class objects  
		  Student s1 = obj.new Student(101,"Sonoo",23);  
		  Student s2 = obj.new Student(102,"Ravi",21);  
		  Student s3 = obj.new Student(103,"Hanumat",25);  
		  
		  //creating array list  
		  ArrayList<Student> al=new ArrayList<Student>(); 
		 //adding Student class object  
		  al.add(s1);
		  al.add(s2);  
		  al.add(s3);  
		  
		  //Getting Iterator  
		  Iterator<Student> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
}
