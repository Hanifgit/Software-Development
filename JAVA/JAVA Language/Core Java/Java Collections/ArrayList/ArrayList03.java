package ArrayList;

import java.util.ArrayList;

public class ArrayList03 {
	public static void main(String args[]) {
		// Creating array list
		ArrayList<String> list = new ArrayList<String>();

		// Adding object in array list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Traversing list through for-each loop
		for (String fruit : list)
			System.out.println(fruit);
	}
}
