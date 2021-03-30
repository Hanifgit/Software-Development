package individualPresentation;

public class Inhertance_01 {
	public static void main(String[] args) {
		P objA = new P();
		B objB = new B();

		objA.my();
		objB.my();
	}
}

class P {
	public void my() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("R");
		}
	}
}

class B {
	public void my() {
		for (int i = 0; i <= 10; i++)
			System.out.println("A");
	}
}