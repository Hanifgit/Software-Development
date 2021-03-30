package PrimaryConceptInheritance;
//Parent ,Super,Base Class
public class Person {
  private String name;
  private int age;
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public String getName() {
	  return name;
  }
 
  public void setAge(int age) {
	  this.age = age;
  } 
  
  public int getAge() {
	  return age;
  }
  
  public void Display1() {
	  System.out.println(name);
	  System.out.println(age);
  }
}
