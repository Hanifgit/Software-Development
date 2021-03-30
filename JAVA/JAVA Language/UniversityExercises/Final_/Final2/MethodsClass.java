package Final2;

public class MethodsClass {
	private static void method1() throws Exception {
		// something
		try {
			System.out.println("something method1");
			throw new Exception();
		} catch (Exception e) {
			//throw e;
		}
	}
	
	private static void method2() throws Exception {
		// something
		try {
			System.out.println("something method2");
			method1();
			//throw new Exception();
		} catch (Exception e) {
			throw e;
		}
	}
	
	private static void method3() throws Exception {
		// something
		try {
			System.out.println("something method3");
			method2();
			//throw new Exception();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			method3();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
