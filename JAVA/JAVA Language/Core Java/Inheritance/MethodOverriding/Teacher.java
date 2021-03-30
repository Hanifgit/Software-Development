package MethodOverriding;

public class Teacher extends Person {
	String qualification;
	
	@Override
	void Display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(qualification);
	}
}
