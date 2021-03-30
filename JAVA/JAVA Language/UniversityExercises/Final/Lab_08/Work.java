package Lab_08;

public class Work {
	static int lifeCycle = 0;
	static void Print1() {
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
	
	 static void Print2() {
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
