
public class StringAndPrimitive {
    public static void main(String[] args) {
    	
    	//Primitive To String
		int i = 100;
		String str1 = Integer.toString(i);
		System.out.println(str1);
		
		double j = 10.50;
		String str2 = Double.toString(j);
		System.out.println(str2);
		
		//String To Primitive
		
		String str3 = "32";
		int k = Integer.parseInt(str3);
		System.out.println(k);
		
		double l = Double.parseDouble(str3);
		System.out.println(l);
		
		int m = Integer.valueOf(str3);
		System.out.println(m);
	}
}
