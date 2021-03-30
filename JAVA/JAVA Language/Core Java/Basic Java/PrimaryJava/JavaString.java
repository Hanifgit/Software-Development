package PrimaryJava;

public class JavaString {
    public static void main(String[] args) {
    	String[] names = {"Pa","Po","N"};
    	for(String x:names) {
    		System.out.println(x);
    	}
    	
    	String s1 = "Papon Ahasan";
    	System.out.println(s1);
    	
    	String s2 = new String("Papon Ahasan");
    	System.out.println(s2);
    	
    	int len = s1.length();
    	System.out.println(len);
    	
    	if(s1.equals(s2)) {
    		System.out.println("EQUAL");
    	}
    	
    	if(s1.contains("Papon Ahasan")) {
    		System.out.println("EQUAL");
    	}
    	
    	if(s1.equalsIgnoreCase("PAPON Ahasan")) {
    		System.out.println("EQUAL"); // UpperCase LowerCase Ignore
    	}
    	
    	boolean con = s1.contains(s2);
    	System.out.println(con);
    	
    	boolean E = s1.isEmpty();
    	System.out.println(E);
    	
    	String s3 = s1 + " " +s2;
    	System.out.println(s3);//Concatation
    	
    	String s4 = s1.concat(s2);
    	System.out.println(s4);//Concatation
    	
    	String Upper = s1.toUpperCase();
    	System.out.println(Upper);
    	
    	String Lower = s1.toLowerCase();
    	System.out.println(Lower);
    	
    	boolean F = s1.startsWith("Pa");
    	System.out.println(F);
    	
    	boolean L = s1.endsWith("san");
    	System.out.println(L);
    	
    	char ch = s1.charAt(0);
    	System.out.println(""+ch); //0 Index character
    	
    	int value = s1.codePointAt(0);
    	System.out.println(""+value);//0 Index ACCIc Value
    	
    	int pos = s1.indexOf("po");
    	System.out.println(""+pos); // character Index return 
    	
    	 pos = s1.lastIndexOf('n');
    	System.out.println(""+pos); // Last Index return
    	
    	String s5 = "  Papon ";
    	String s6 = s5.trim(); //s5 string first and last space remove
    	System.out.println(s6);
    	
    	String s7 = s1.replace('P', 'R');
    	System.out.println(s7);
    	
    	String[] s8 = s1.split(" "); //s1 string space cut 
    	for(String x:s8) {
    		System.out.println(x);
    	}
    }
}
