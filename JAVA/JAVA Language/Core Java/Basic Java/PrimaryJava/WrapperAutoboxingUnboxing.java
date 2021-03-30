package PrimaryJava;

public class WrapperAutoboxingUnboxing {
   @SuppressWarnings("deprecation")
public static void main(String[] args) {
	  int x = 30;
	  Integer y = Integer.valueOf(x); //autoboxing
	  System.out.println(y);
	  
	  Integer z = x; //Unboxing
	  System.out.println(z);
	  
	  Double double1 = new Double(10.25);
	  System.out.println(double1);
	  
	  double e = double1.intValue();
	  System.out.println(e);
   }
}
