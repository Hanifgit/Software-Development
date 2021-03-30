package MakeThread;

public class A{
	
	public void name() {
		for(int i=0;i<10;i++) {
			System.out.println(1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
