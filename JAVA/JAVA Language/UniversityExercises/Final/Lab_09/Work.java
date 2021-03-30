package Lab_09;

public class Work {
	static int lifeCycle = 0;
	synchronized static void Print1() {
		for(int i=1;i<=10;i++) {
			lifeCycle++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(lifeCycle);
		}
	}
	
	synchronized static void Print2() {
		for(int i=1;i<=10;i++) {
			lifeCycle--;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(lifeCycle);
		}
	}
}
