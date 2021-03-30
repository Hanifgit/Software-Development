package Throws;

import java.util.Scanner;

public class MoreOnThrows {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		if (number <= 0) {
		     throw new A();
		}

		A obj = new A();
		try {
			obj.Print1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		obj.Print2();
		
		input.close();
	}
}

@SuppressWarnings("serial")
class A extends RuntimeException {
	public A() {
		System.out.println("My Message");
	}

	public void Print1() throws Exception {
		//ckaked
	}

	public void Print2() throws RuntimeException {
         //unckaked
	}
}
