package Synchronization_;

public class staticSynchronization {
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread0 extends Thread {
	public void run() {
		staticSynchronization.printTable(1);
	}
}

class MyThread7 extends Thread {
	public void run() {
		staticSynchronization.printTable(10);
	}
}

class MyThread8 extends Thread {
	public void run() {
		staticSynchronization.printTable(100);
	}
}

class MyThread9 extends Thread {
	public void run() {
		staticSynchronization.printTable(1000);
	}
}

class TestSynchronization4 {
	public static void main(String t[]) {
		MyThread0 t1 = new MyThread0();
		MyThread7 t2 = new MyThread7();
		MyThread8 t3 = new MyThread8();
		MyThread9 t4 = new MyThread9();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
