package factorial;

public class Main {
	public static void main(String[] args) {
		RecursionFactorial objFactorial = new RecursionFactorial();
		
		int result = objFactorial.fact(5);
		System.out.println(result);
		
		result = objFactorial.fact(4);
		System.out.println(result);
	}
}
