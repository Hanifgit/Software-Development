package RakibulAhasan_022;

import java.util.*;

enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
} 

public class JavaCollections extends Thread{
	public void run() {
		//Creating array list
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		Collections.sort(list);
		list.remove("Grapes"); 
		System.out.println("Array list of elements: "+list);
		
		//Creating array Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		map.remove(1);
		map.remove(2, "Rahul");
		System.out.println("Map list of elements: "+map);
		
		//Creating EnumSet
		Set<days> set1 = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		System.out.println("Week Days:"+set1);
		Set<days> set2 = EnumSet.allOf(days.class);  
	    System.out.println("Week Days:"+set2);
	    
	    //Creating Dequeue
	    Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");    
		deque.add("Vijay");     
		deque.add("Ajay");
		deque.offer("Papon");
		deque.remove();
		deque.element();
		deque.poll(); 
	    deque.pollFirst(); 
		deque.pollLast(); 
		System.out.println("Deque list of elements: ");
		for (String str : deque) {  
			   System.out.println(str);
		}
		
		//Creating LinkedList
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(1, "Gaurav"); 
		al.addFirst("Lokesh"); 
		al.addLast("Harsh");
		System.out.println("Linked list of elements: "+al);
		LinkedList<String> all=new LinkedList<String>();
		all.addAll(al);
		System.out.println("Linked list of elements: "+all);
		
		//Creating Queue
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("Linked list head:" + queue.element());
		System.out.println("Linked list head:" + queue.peek());
		System.out.println("Linked list of elements: "+queue);
		
		//Creating Vector
		Vector<String> vec = new Vector<String>();  
        vec.add("Tiger");  
        vec.add("Lion");
        vec.addElement("Rat");  
        vec.addElement("Cat");
        vec.addElement("Cat");
        vec.add("Lion");
        vec.removeElementAt(5);  
        System.out.println("Vector Elements are: "+vec); 
        System.out.println("Vector Size is: "+vec.size());
        System.out.println("Vector Element at index 1 is = "+vec.get(1));
        System.out.println("Vector Remove element at index 4: " +vec.remove(3));
        
       //Collections Some Method
        List<Integer> Clist = new ArrayList<Integer>();
        Clist.add(8);  
        Clist.add(67);  
        Clist.add(8);  
        Clist.add(16);  
        Clist.add(8);  
        Clist.add(12);
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("maximum element from the collection: "+Collections.max(Clist));  
        System.out.println("minimum element from the collection: "+Collections.min(Clist));
        System.out.println("Frequency of the Word: "+Collections.frequency(Clist,8));
	}
	
}
