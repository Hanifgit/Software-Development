package A_03;

//A Simple Java program to demonstrate 
//method overriding in java 

//Base Class 
class Parent {
	// Final methods can not be overridden
	final void show1() {
	}

	// private methods are not overridden
	//private void m1() {
		//System.out.println("From parent m1()");
	//}

	void show() {
		System.out.println("Parent's show()");
	}
	
	//private void Eat() {
		
	//}
}
