package TypeCasting;

public class Main {
	public static void main(String[] args) {
		
		int x = 10;
		double y = 3.14;
		//integer < double
		y = x;
		x = (int)y;
		
		A objA = new A();
		objA.Display();
		
		B objB = new B();
		objB.Display();
		
		A obA = new B();
		obA.Display();
		
		B oB = (B)new A();
		oB.Display(); //kaj korbe na
	}
}
