package WithSynchronization;

public class Main_Class {
	public static void main(String[] args) {
		CreateFile obj1 = new CreateFile();
		JavaString obj2 = new JavaString();
		JavaConversion obj3 = new JavaConversion();
		JavaCollections obj4 = new JavaCollections();

		obj1.start();
		// obj1.join();
		obj2.start();
		// obj2.join();
		obj3.start();
		// obj3.join();
		obj4.start();
	}
}
