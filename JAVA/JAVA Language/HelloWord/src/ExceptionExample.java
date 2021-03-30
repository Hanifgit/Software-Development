
public class ExceptionExample {
	public static void main(String args[]) {
		try {
			int a = 0;
			int b = 42 / a;
		} catch (ArithmeticException e) {
			System.out.println("Only Exception");
		} catch (Exception e) {
			System.out.println("ArithmeticException");
		}
	}
}
