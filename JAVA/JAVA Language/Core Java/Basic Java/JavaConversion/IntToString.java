package JavaConversion;

public class IntToString {
	public static void main(String[] args) {
		int integer = 123;
		
		String string1 = String.valueOf(integer);
		String string2 = Integer.toString(integer);
		String string3 = String.format("%d", integer);
		
		System.out.println(integer+4);
		System.out.println(string1+4);
		System.out.println(string2+4);
		System.out.println(string3+4);
	}
}
