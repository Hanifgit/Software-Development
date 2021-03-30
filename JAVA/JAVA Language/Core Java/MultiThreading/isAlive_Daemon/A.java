package isAlive_Daemon;

public class A extends Thread{
	int x=0;
	@Override
	public void run() {
		for(int i=0;i<100000;i++) {
			x++;
		}
		System.out.println("A Class: "+x);
	}
}
