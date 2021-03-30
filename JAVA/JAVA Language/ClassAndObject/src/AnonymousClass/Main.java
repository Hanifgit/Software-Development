package AnonymousClass;

public class Main {
	public static void main(String[] args) {
		Person objPerson = new Person() {
			@Override
			void display() {
				System.out.println("Test Class");
			}
		};
		objPerson.display();
	}
}
