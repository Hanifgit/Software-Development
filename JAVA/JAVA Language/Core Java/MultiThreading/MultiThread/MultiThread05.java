package MultiThread;

/* t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing. */
public class MultiThread05 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		MultiThread05 t1 = new MultiThread05();
		MultiThread05 t2 = new MultiThread05();
		MultiThread05 t3 = new MultiThread05();
		t1.start();
		try {
			t1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
