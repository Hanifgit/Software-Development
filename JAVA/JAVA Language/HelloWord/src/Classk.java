
import java.util.ArrayList;
import java.util.ListIterator;

public class Classk {
	
	public static void main(String[] args) {
		ArrayList < String > celebrities = new ArrayList < String > ();
		 
        celebrities.add("Tom Cruise");
        celebrities.add("Will Smith");
        celebrities.add("Jackie Chan");
        celebrities.add("Akshay Kumar");
 
        ListIterator < String > listIterator = celebrities.listIterator();
 

 
        System.out.println("Backward direction:- ");
 
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
	}
	 
	/*
	 * public static void main(String[] args) {
	 * 
	 * String[] strArray= {"bubt","cse","dept"}; Arrays.sort(strArray); for(String
	 * str:strArray) { System.out.println(str+ " "); } System.out.println();
	 * 
	 * ArrayList<String>arlTest = new ArrayList<String>(); arlTest.add("D");
	 * arlTest.add("U"); arlTest.add("K"); arlTest.add("E"); arlTest.remove("D");
	 * arlTest.remove(2); System.out.println(arlTest.contains("K")); }
	 */

}
