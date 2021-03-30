package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList05 {
	public static void main(String args[]) {
		// Creating array list
		ArrayList<String> list = new ArrayList<String>();

		// Adding object in array list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
	}
}
