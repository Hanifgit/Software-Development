package MultiThread;

public class MultiThread02 implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThread02 m1 = new MultiThread02();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
