package JavaConversion;

public class StringToLong {
	public static void main(String[] args) {
		String string = "9990449935";
		
		Long long1 = Long.valueOf(string);
		Long long2 = Long.parseLong(string);
		long long3 = Long.parseLong(string);
		
		System.out.println(long1+5);
		System.out.println(long2+5);
		System.out.println(long3+5);
	}
}
