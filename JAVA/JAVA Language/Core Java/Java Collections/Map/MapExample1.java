package Map;

/*
 * A map contains values on the basis of key, i.e. key and value pair.
 * A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * A Map doesn't allow duplicate keys, but you can have duplicate values
 */
import java.util.*;
import java.util.Map.Entry;

public class MapExample1 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		map.put(100,"Amit");    
	    map.put(101,"Vijay");    
	    map.put(102,"Rahul");  
		
		// Traversing Map 1Way
		Set<Entry<Integer, String>> set = map.entrySet();// Converting to Set so that we can traverse
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println();
		
		// Traversing Map 2Way
		for(Map.Entry m:map.entrySet()){  
			 System.out.println(m.getKey()+" "+m.getValue());  
		} 
		System.out.println();
		
		/*
		 //MAP REVERSE
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		*/
		
		
		/*
		 //MAP SHORT
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue()) 
		*/
		
		// Traversing Map 3Way
		map.entrySet()
		.forEach(System.out::println);
		System.out.println();
		
		map.remove(1); 
		map.remove(6);
		map.remove(102, "Rahul");
		map.replace(100, "Gaurav");  
	    System.out.println("Updated list of elements: "+map);
	}
}
