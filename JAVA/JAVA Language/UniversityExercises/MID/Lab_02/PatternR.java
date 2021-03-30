package Lab_02;

import java.util.Scanner;

public class PatternR {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		// n = 6
		int i, j, h = (n / 2); // 3
		int k = (2 * n) - 1; // 11
		for (i = 0; i < n; i++) {
			System.out.print("*");
			for (j = 0; j < k; j++) {
				if ((i == 0 || i == h) && j < (k - 2))
					System.out.print("*"); // 9
				else if (j == (k - 2) && !(i == 0 || i == h)) // 9
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
