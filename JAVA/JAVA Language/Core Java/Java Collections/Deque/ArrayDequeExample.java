package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
/*
 * Java Deque Interface is a linear collection that supports element insertion and removal at both ends.
 */
public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");    
		deque.add("Vijay");     
		deque.add("Ajay");
		deque.offer("Papon");
		//Traversing elements  
		for (String str : deque) {  
		   System.out.println(str);
		}
		
		deque.remove();
		deque.element();
		//deque.poll(); 
	    //deque.pollFirst();//it is same as poll()  
		//deque.pollLast();  
	    System.out.println("After pollLast() Traversal...");  
	    for(String Str:deque){  
	        System.out.println(Str); 
	    }
	}
}
