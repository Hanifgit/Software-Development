/*
 * Polymorphism is a mechanism where a parent class
 * reference variable can take many forms(it can object from
 * different classes
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.Display();
		
		person = new Teacher();
		person.Display();
		
		person = new Student();
		person.Display();
	}
}
