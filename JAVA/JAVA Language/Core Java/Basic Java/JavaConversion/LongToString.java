package JavaConversion;

public class LongToString {
	public static void main(String[] args) {
		long l=9993939399L; 
		
		String string1 = String.valueOf(l);
		String string2=Long.toString(l);
		
		System.out.println(string1); 
		System.out.println(string2); 
	}
}
