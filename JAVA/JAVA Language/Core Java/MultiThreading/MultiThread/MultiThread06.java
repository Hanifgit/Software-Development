package MultiThread;

public class MultiThread06 extends Thread {
	@Override
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		MultiThread06 t1 = new MultiThread06();
		MultiThread06 t2 = new MultiThread06();
		System.out.println("Name of t1 :" + t1.getName());
		System.out.println("Name of t2 :" + t2.getName());
		System.out.println("id of t1 :" + t1.getId());

		t1.start();
		t2.start();

		t1.setName("Sonoo Jaiswal");
		System.out.println("After changing name of t1:" + t1.getName());
	}
}
