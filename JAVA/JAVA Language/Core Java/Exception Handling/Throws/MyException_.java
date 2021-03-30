package Throws;

import java.util.Scanner;

public class MyException_ {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws MyException {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		if (number <= 0) {
			throw new MyException("My Message");
		}

		input.close();
	}
}

@SuppressWarnings("serial")
class  MyException extends Exception {
	public MyException(String m) {
		super(m);
		System.out.println("My Exception(Controctor)");
	}
}