package MultiThread;

public class MultiThread01 extends Thread {
	@Override
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThread01 t1 = new MultiThread01();
		t1.start();
	}
}
