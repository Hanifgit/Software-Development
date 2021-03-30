package A_03;

//Inherited class 
class Child extends Parent {

	static void p1() 
    { 
       System.out.println("From child p1()"); 
    }

	// new m1() method
	// unique to Child class
	//private void m1() {
		//System.out.println("From child m1()");
	//}

	 //Final methods can not be overridden
	//void show1() {
		//System.out.println("Child's show()");
	//}
	
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}
