import java.util.Scanner;

public class ProblemSolving {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				int a = input.nextInt();
				int b = input.nextInt();
				int result = a / b;
				System.out.println(result);

			} catch (Exception e) {
				System.out.println(e);
				System.out.println("You mast enter Integer.Please try Again");
			}
		}
	}
}
