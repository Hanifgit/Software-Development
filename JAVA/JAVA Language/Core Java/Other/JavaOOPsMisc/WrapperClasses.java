package JavaOOPsMisc;

/*
Primitive Type	Wrapper class
boolean	         Boolean
char	         Character
byte	         Byte
short	         Short
int	             Integer
long	         Long
float	         Float
double           Double
*/

public class WrapperClasses {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/*Autoboxing*/
		
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally    
		System.out.println(a+" "+i+" "+j); 
		
		
		/*Unboxing*/
		
		//Converting Integer to int    
		Integer b = new Integer(3);    
		int k=b.intValue();//converting Integer to int explicitly  
		int l=b;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+k+" "+l);    
	}
}
