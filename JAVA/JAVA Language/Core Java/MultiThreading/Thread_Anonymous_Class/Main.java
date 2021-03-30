package Thread_Anonymous_Class;

//Runnable interface
public class Main {
	public static void main(String[] args) {
		/*First Way*/
		Runnable obj = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Rakibul Ahasan");
			}
		};
		
		Thread t1 = new Thread(obj);
		t1.start();
		
		/*Second Way*/
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Papon Ahasan");
			}
		});
		t2.start();
	}
}
