package RakibulAhsan__022;

public class Main_Class {
	public static void main(String[] args) {
		JavaConversion obj1 = new JavaConversion();
		JavaCollections obj2 = new JavaCollections();
		ComparableClass obj3 = new ComparableClass();
		CreateFile obj4 = new CreateFile();
		JavaString obj5 = new JavaString();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		Thread thread3 = new Thread(obj3);
		Thread thread4 = new Thread(obj4);
		Thread thread5 = new Thread(obj5);
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
			thread3.start();
			thread3.join();
			thread4.start();
			thread4.join();
			thread5.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
