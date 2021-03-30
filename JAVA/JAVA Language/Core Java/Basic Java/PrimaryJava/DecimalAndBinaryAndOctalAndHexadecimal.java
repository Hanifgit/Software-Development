package PrimaryJava;
public class DecimalAndBinaryAndOctalAndHexadecimal {
	public static void main(String[] args) {
		//Decimal to ----
		int decimal = 15;
		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);
		
		String octal = Integer.toOctalString(decimal);
		System.out.println(octal);
		
		//Binary,octal,Hexadecimal to Decimal
		
	     binary = "1010";
		Integer Decimal = Integer.parseInt(binary, 2);//2 base
		System.out.println(Decimal);
		
		String hexString = "F";
		 Decimal = Integer.parseInt(hexString, 16);//16 base
		System.out.println(Decimal);
	}
}
