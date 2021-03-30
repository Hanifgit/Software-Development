package PrimaryConceptAbstraction;
/*
 * Abstraction is the process of hiding the implementation
  details and showing only the functionality to the user.
 * Abstract method has no body
 * Abstract method must be ends with a semicolon
 * Abstract method must be Abstract Class
 * Abstract method must be overridden
 * Abstract method can never be final and static
 * Abstract Class have abstract and non-abstract method
 * Non-abstract class can not have abstract method
 * Abstract class not create object but create reference variable
 */
public class Main {
	public static void main(String[] args) {
		MobileUser rVariabl; //Reference variable
		
		rVariabl  = new Papon();
		rVariabl.SendMessage();
		rVariabl.Call();
		
		rVariabl  = new Ahasan();
		rVariabl.SendMessage();
	}
}
