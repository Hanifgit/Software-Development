package JavaString;

public class charAt {
     static String name;
    
	public static  char charAt_(int index) {
		if ((index < 0) || (index >= name.length())) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return name.charAt(index);
	}

	public static void main(String[] args) {
		String s = "Sachin";
		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h

		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n"));// true

	    name = "javatpoint";
		char ch = name.charAt(4);// returns the char value at the 4th index
		System.out.println(ch);
		
		ch = charAt_(0);
		System.out.println(ch);
	}
}
