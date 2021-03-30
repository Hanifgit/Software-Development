package Vector;

import java.util.Vector;

public class VectorExample {
	 public static void main(String args[]) {  
         //Create a vector  
         Vector<String> vec = new Vector<String>();  
         vec.add("Tiger");  
         vec.add("Lion");  
         vec.add("Dog");  
         vec.add("Elephant");  
         vec.addElement("Rat");  
         vec.addElement("Cat");  
         vec.addElement("Deer");
         vec.removeElementAt(5);  
         System.out.println("Elements are: "+vec); 
         System.out.println("Size is: "+vec.size());
         System.out.println("Element at index 1 is = "+vec.get(1));
         System.out.println("Remove element at index 4: " +vec.remove(4));
      }  
}
