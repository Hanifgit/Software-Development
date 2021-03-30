package MultiThread;

/*
 * The join() method waits for a thread to die. 
 * It causes the currently running threads to stop executing until the thread it joins with completes its task.
 */

/* t1 completes its task then t2 and t3 starts executing. */
public class MultiThread04 extends Thread {
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
		MultiThread04 t1 = new MultiThread04();
		MultiThread04 t2 = new MultiThread04();
		MultiThread04 t3 = new MultiThread04();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
