package MultiThread;
/*
 *  By default, each thread has a name i.e. thread-0, thread-1 and so on. 
 *  By we can change the name of the thread by using setName() method. 
 */
public class MultiThread07 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
	}

	public static void main(String args[]) {
		MultiThread07 t1 = new MultiThread07();
		MultiThread07 t2 = new MultiThread07();

		t1.start();
		t2.start();
	}
}
