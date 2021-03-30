package individualPresentation;

public class ThreadMethod_01 {

	public static void main(String args[]) throws InterruptedException {
		// creating thread
		W t1 = new W();
		
		//t1.setDaemon(true); //5
		System.out.println(t1.isAlive()); //return true/false
		// this will call the run() method
		t1.start(); //2
		
		System.out.println(t1.isAlive()); //3
		
		System.out.println("Inside main Method : "+Thread.currentThread().getName());
		
		//t1.join(); //4
		System.out.println(t1.cnt);
		
		t1.setName("My Thread"); //6
		System.out.println("After changing name of t1: "+t1.getName());  //7
	}
}

class W extends Thread{
	int cnt = 0;
	@Override
	public void run() { //1
		System.out.println("Inside run Method : "+Thread.currentThread().getName());
		for(int i=0;i<1000;i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
}