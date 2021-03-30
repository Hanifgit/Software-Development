package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example {
	int id;
	String name, author, publisher;
	int quantity;

	public Example(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}
	
	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<Example> list = new ArrayList<Example>(); 
	    //Creating Books  
	    Example b1=new Example(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Example b2=new Example(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
	    Example b3=new Example(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Example b:list){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
}
