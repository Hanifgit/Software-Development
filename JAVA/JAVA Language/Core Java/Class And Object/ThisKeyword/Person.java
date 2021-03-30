package ThisKeyword;

public class Person {
	 String name;
	 int age;
	 double weight;
	
	void Message() {
		System.out.println("I am Papon Ahasan");
	}
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	 
    Person(String name,int age,double weight) {
    	this(name, age);
		//this.name = name;
		//this.age = age;
		this.weight = weight;
	}
    
    public void Display() {
    	this.Message();
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
	}
}
