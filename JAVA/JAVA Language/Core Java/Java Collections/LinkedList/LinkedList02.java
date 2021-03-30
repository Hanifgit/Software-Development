package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList02 {
	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		//Adding an element at the specific position  
        al.add(1, "Gaurav");  
        
        //Adding an element at the first position  
        al.addFirst("Lokesh");  
        
        //Adding an element at the last position  
        al.addLast("Harsh"); 
        
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        al.addAll(1, ll3);
        ll3.addAll(al);  
        System.out.println(al);
	}
}
