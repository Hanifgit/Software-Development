package Throw;

import java.util.Scanner;

public class MyException_ {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int number = input.nextInt();
			
			if(number<=0) {
				throw new MyException("My Message");
			}
		}
		catch (MyException e) {
			System.out.println("My Exception");
			e.printStackTrace();
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

