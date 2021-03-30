//Overloading constructor, constructor type or List Different
public class Teacher {
   String name,gender;
   int phone;
   
   Teacher(){
	   System.out.println("No Value"); 
   }
   
   Teacher(String n,String g){
	   name = n;
	   gender = g; 
   }
   
   Teacher(String n,String g,int p) {
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
