
/*
 * There are four types access modifier
 * Private
 * Default
 * Protected
 * Public
 * Encapsulation variables and methods into a single unit(Class)
 * Private Declare (get ,set method)
 */
public class Main {
	public static void main(String[] args) {
		ThisClass objClass = new ThisClass();
		
		objClass.setNameString("Papon");
		System.out.println(objClass.getNameString());
		
		objClass.setAge(24);
		System.out.println(objClass.getAge());
	}
}
