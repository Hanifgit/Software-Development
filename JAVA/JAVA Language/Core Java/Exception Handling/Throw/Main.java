package Throw;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int number = input.nextInt();
			if (number >= 10) {
				// Exception e = new Exception();
				// throw e;
				throw new Exception("Number greater then 10");
			}
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Compiler Exception");
			e.printStackTrace();
		}

		input.close();
	}
}
