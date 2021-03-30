package List;
/*
 * List in Java provides the facility to maintain the ordered collection. 
  It contains the index-based methods to insert, update, delete and search the elements. 
  It can have the duplicate elements also. We can also store the null elements in the list.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Creating a List of type String using ArrayList  
		List<String> list1 = new ArrayList<String>();  
		  
		//Creating a List of type Integer using ArrayList  
		List<Integer> list2 = new ArrayList<Integer>();  
		  
		//Creating a List of type Book using ArrayList  
		List<Book> list3 = new ArrayList<Book>();  
		  
		//Creating a List of type String using LinkedList  
		List<String> list4 =new LinkedList<String>();  
		
		
		//Adding elements in the List  
		 list1.add("Mango");  
		 list1.add("Apple");  
		 list1.add("Banana");  
		 list1.add("Grapes"); 
		 
		//Iterating the List element using for-each loop  
		 for(String fruit:list1)  
		  System.out.println(fruit); 
		 
		//accessing the element    
		 System.out.println("Returning element: "+list1.get(1));//it will return the 2nd element, because index starts from 0  
		 //changing the element  
		 list1.set(1,"Dates");  
	}
}
