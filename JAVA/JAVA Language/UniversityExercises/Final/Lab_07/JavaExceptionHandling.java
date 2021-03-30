package Lab_07;

import java.util.Scanner;

public class JavaExceptionHandling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        boolean flag = true;
		while (flag) {
			try {
				System.out.println("Enter Two Number: ");
				int a = input.nextInt();
				int b = input.nextInt();
				System.out.println("Division Result : " + a / b);
				flag  = false;
				input.close();
				throw new Exception("Divided Can only positive number");
			} catch (Exception e) {
				System.out.println("So we can n't divided by zero!!");
				System.out.println("Please input again");
				System.out.println(e);
				System.out.println(e.getMessage());
			}

		}
	}
}
