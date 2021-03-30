package ArrayList;

import java.util.ArrayList;

public class ArrayList04 {
	public static void main(String args[]) {
		// Creating array list
		ArrayList<String> list = new ArrayList<String>();

		// Adding object in array list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
