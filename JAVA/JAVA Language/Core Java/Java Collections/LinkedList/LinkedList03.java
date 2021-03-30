package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList03 {
	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		//Removing specific element from array list   
        al.remove("Gaurav");  
        
        //Removing element on the basis of specific position  
        al.remove(0);
        
        //remove an element at the first position  
        al.removeFirst();  
        
        //remove an element at the last position  
        al.removeLast(); 
        
        //Removing first occurrence of element from the list  
        al.removeFirstOccurrence("Gaurav");  
        
        //Removing last occurrence of element from the list  
        al.removeLastOccurrence("Harsh");  
        
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
     
       //Removing all the new elements from arraylist  
        al.removeAll(ll3);  
        System.out.println(al);
	}
}
