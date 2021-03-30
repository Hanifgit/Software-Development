package PrimaryJava;
import java.text.DecimalFormat;

/* Local Variable 
 * Instance Variable 
 * Class/Static Variable 
 */
public class DataTypeAndVariable {
	public static void main(String[] args){
		
        System.out.print("Hello\n573498\n");
        System.out.println("Papon\t2");
        System.out.println(12);
        
        int x = 5;
        System.out.println(x);
        System.out.println("X = "+x);
        System.out.printf("b = %d\n",x);
        
        boolean b = false;
        System.out.printf("b = %b\n",b);
        
        float w = 1.23f;
        System.out.printf("b = %f\n",w);
        
        char c = 'a';
        System.out.printf("b = %c\n",c);
        
        double d = 1.234;
        System.out.printf("b = %.2f\n",d);
        
        DecimalFormat obj = new DecimalFormat("0.000");
        double m = 3.1416234561;
        System.out.println(obj.format(m));
        
        String var = "Papon";
		System.out.println(var);
		
		String k = new String("hrhrh");
		System.out.println(k);
    }
}
