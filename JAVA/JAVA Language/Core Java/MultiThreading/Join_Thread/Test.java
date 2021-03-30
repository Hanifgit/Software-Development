package Join_Thread;

public class Test {
	public static void main(String[] args) {
		A o = new A();
		o.start();
		
		try {
			//Thread.sleep(1);
			o.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Class: "+o.x);
	}
}
