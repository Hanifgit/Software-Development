package HashSet;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet contains unique elements only.
 */
public class HashSet1 {
	public static void main(String[] args) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		System.out.println("An initial list of elements: "+set);  
		
		//Removing specific element from HashSet  
        set.remove("One");  

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
