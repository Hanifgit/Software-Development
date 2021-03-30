package JavaConversion;

public class StringToInt {
	public static void main(String[] args) {
		String string = "123";
		
		int integer = Integer.parseInt(string);
		Integer i = Integer.valueOf(string);
		int j = Integer.valueOf(integer);
		
		System.out.println(string+4);
		System.out.println(integer+4);
		System.out.println(i+4);
		System.out.println(j+4);
	}
}
