package AnonymousClass;

public class Main {
	public static void main(String[] args) {
		Person1 objPerson = new Person1() {
			@Override
			public void display() {
				System.out.println("Interface Test Class");
			}
		};
		objPerson.display();
		
		
		Person2 objPerson1 = new Person2() {
			@Override
			public void display() {
				System.out.println("Abstract Test Class");	
			}
		};
		objPerson1.display();
		objPerson1.Print();
	}
}
