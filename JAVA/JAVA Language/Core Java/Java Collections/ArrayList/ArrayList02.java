package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList02 {
	public static void main(String args[]) {
		// Creating array list
		ArrayList<String> list = new ArrayList<String>();

		// Adding object in array list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}
	}
}
