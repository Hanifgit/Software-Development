package WithOutSynchronization;

public class Main_Class {
	public static void main(String[] args) {
		CreateFile obj1 = new CreateFile();
		obj1.start();
		
		JavaString obj2 = new JavaString();
		obj2.start();
		
		JavaConversion obj3 = new JavaConversion();
		obj3.start();
		
		JavaCollections obj4 = new JavaCollections();
		obj4.start();
	}
}
