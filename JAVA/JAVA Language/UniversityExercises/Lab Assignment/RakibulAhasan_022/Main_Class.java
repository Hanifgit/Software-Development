package RakibulAhasan_022;

public class Main_Class {
	public static void main(String[] args) {
		JavaConversion obj1 = new JavaConversion();
		JavaCollections obj2 = new JavaCollections();
		ComparableClass obj3 = new ComparableClass();
		CreateFile obj4 = new CreateFile();
		JavaString obj5 = new JavaString();
		ClassOPP obj6 = new ClassOPP("Rakibul Ahasan", 23);
		
		obj1.start();
		obj2.start();
		obj4.start();
		obj5.start();
		obj6.start();
		
		Thread thread = new Thread(obj3);
		thread.start();
		
		
		 Count cnt = new Count();
	      try
	      {
	         while(cnt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	}
}
