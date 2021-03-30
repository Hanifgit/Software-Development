
public class MainClass {
	
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	
	public static void main(String[] args) {
		myMethod objMethod = new myMethod();
		System.out.println(objMethod.square(5));
		System.out.println(objMethod.str);
		
		myMethod();
	}
}
