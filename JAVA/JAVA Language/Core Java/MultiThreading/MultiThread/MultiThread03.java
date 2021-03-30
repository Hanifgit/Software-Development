package MultiThread;

/*
 * The sleep() method of Thread class is used to sleep a thread for the specified amount of time
 * public static void sleep(long milieseconds)throws InterruptedException
 */
public class MultiThread03 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		MultiThread03 t1 = new MultiThread03();
		MultiThread03 t2 = new MultiThread03();

		t1.start();
		t2.start();
		
		/*
		  t1.start();  
		  t1.start(); 
		  Can not we start a thread twice.An IllegalThreadStateException is thrown.
		  Thread will run once but for second time, it will throw exception.
		 */
	}
}
