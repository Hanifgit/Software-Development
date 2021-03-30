package MakeThread_Runnable;

public class Test {
	public static void main(String[] args){
		A o = new A();
		Thread thread = new Thread(o,"My Thread1 : ");
		thread.start();
		
		//System.out.println(thread.getName());
		//Thread thread2 = Thread.currentThread();
		System.out.println(Thread.currentThread().getName());
	}
}
