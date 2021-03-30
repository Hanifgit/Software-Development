import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionsAddAll {
	public static void main(String a[]) {

		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("c");
		myList.add("c++");
		Collections.addAll(myList, "perl", "php");
		
		String[] strArr = { ".Net", "unix" };
		Collections.addAll(myList, strArr);
		System.out.println("After adding array:" + myList);
		
		ArrayList<Integer> arrlist1 =  new ArrayList<Integer>();
		ArrayList<Integer> arrlist2 =  new ArrayList<Integer>(5);
		arrlist1.addAll(arrlist2);
		
		Collection<String> colA = new ArrayList<String>();
		colA.add("A");
		colA.add("B");
		colA.add("C");
		
		Collection<String> target = new HashSet<String>();
		target.addAll(colA); 
		
		// add the specified element to specified Collections 
        // using addAll() method 
        boolean b = Collections.addAll(target, "1", "2", "3");
	}
}
