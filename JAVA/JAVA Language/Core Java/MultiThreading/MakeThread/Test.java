package MakeThread;
/*
 *  A Mulithreaded program contains two or more parts that can run concurrently.
 *  Each part of such a program is called a thread. and each thread defines a separate path of execution
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		A o = new A();
		o.name();

		for (int i = 0; i < 10; i++) {
			System.out.println(2);
			Thread.sleep(500);
		}
	}
}
