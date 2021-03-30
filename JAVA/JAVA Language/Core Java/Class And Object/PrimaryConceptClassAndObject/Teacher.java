package PrimaryConceptClassAndObject;

public class Teacher {
   String name,gender;
   int phone;
   
   void get(String n,String g,int p) {
	   name = n;
	   gender = g;
	   phone = p;
   }
   void Print() {
	   System.out.println(name);
	   System.out.println(gender);
	   System.out.println(phone);
   }
}
