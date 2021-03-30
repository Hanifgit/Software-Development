package JavaString;

public class UpperCase_LowerCase {
	public static void main(String[] args) {
		String s="Sachin";  
		String str=" Sachin ";  
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)
		
		System.out.println(str);
		System.out.println(str.trim());//tring trim() method eliminates white spaces before and after string. 
	}
}
