package AnonymousClass;

public class Anonymous1 {
	public static void main(String[] args) {
		A objA = new A() {

			@Override
			public void print1() {
				System.out.println("Mohamed");
				name();
			}

			public void name() {
				System.out.println("MY NAME");
			}
		};
		objA.print1();
		objA.print2();

		objA = new A();
		objA.print1();
	}
}

class A {
	public void print1() {
		System.out.println("Rakibul");
	}

	public void print2() {
		System.out.println("Ahasan");
	}

	public void print3() {
		System.out.println("Papon");
	}
}
