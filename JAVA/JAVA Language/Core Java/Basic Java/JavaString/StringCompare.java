package JavaString;

public class StringCompare {
	public static void main(String[] args) {
		 String s1="Sachin";
		 String s2="Sachin";
		 String s3="SACHIN";  
		 System.out.println(s1.equals(s2));//true
		 System.out.println(s1.equals(s3));//false
		 System.out.println(s1.equalsIgnoreCase(s3));//true
		 
		 System.out.println(s1==s2);
		 
		 System.out.println(s1.compareTo(s2));//0  
		 System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		 System.out.println(s3.compareTo(s1));//-1(because s3 < s1 ) 
	}
}
