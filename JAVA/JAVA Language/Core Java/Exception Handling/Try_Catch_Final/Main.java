package Try_Catch_Final;
/*
 * The exception handling is one of the powerful mechanism to
  handle the runtime errors.
 * There are 5 keywords exception handling
 * try,catch,finally,throw,throws
 * Arithmetic Exception
 * Null pointer Exception
 * String Index Out Of Bounds Exception
 * Number Format Exception
 * Fill Not Found Exception
 * Array Index of Bounds Exception
 */
public class Main {
	public static void main(String[] args) {
		
		try {
			int[] a = new int[4];
			a[5] = 10;
			
			int x = 10;
			int y = 0;
			int result = x/y;
			System.out.println(result);
			
			
			
		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
		finally {
			System.out.println("I am papon"); 
		}
		System.out.println("I am papon");
	}
}
