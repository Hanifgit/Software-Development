package Interface;
/*
 * An interface is a collection of abstract methods.
 * For fully abstraction (Not use non-abstraction methods)
 * it supports multiple inheritance
 * Interface variable constant(Static final) hoie
 * Interface method Public thakbe
 */
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		//Interface(Animal object don't create)
		//Interface doesn't contain constructor
		//Interface all The method are abstract
		//Interface can't use instance variable
		//Interface supported multiple Inheritance
	}
}
