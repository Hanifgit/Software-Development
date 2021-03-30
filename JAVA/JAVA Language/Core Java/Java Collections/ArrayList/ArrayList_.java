package ArrayList;
/*
 * Java ArrayList class can contain duplicate elements.
 * In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of 
   shifting needs to occur if any element is removed from the array list.
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_ {
	public static void main(String args[]) {
		// Creating array list
		ArrayList<String> list = new ArrayList<String>();
		// Adding object in array list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Adding an element at the specific position
		list.add(1, "Gaurav");

		// Printing the array list object
		System.out.println(list);

		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		list.set(1, "Dates");

		// Sorting the list
		Collections.sort(list);

		// Printing the array list object
		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<String>();
		// Adding second list elements to the first list
		list2.addAll(list);
		// Printing the array list object
		System.out.println(list2);
		
		
		 ArrayList<String> list3=new ArrayList<String>();  
         list3.add("John");  
         list3.add("Rahul");  
         //Adding second list elements to the first list at specific position  
         list3.addAll(1, list); 
         System.out.println(list3);
         
       //Removing specific element from array list  
         list3.remove("Apple"); 
         
       //Removing element on the basis of specific position  
         list3.remove(0); 
         
       //Removing all the new elements from array list  
         list2.removeAll(list);
         
         list.retainAll(list2); 
         
       //Removing all the elements available in the list  
         list3.clear();  
         
         System.out.println("Is ArrayList Empty: "+list.isEmpty()); 
	}
}
