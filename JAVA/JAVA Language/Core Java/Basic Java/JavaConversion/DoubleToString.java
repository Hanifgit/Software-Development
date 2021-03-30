package JavaConversion;

public class DoubleToString {
	public static void main(String[] args) {
		double num = 12.34;
		
		String string = String.valueOf(num);
		String str = Double.toString(num);
		
		System.out.println(string);
		System.out.println(str);
	}
}
