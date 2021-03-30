package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample implements Comparable<TreeSetExample> {
	int id;
	String name, author, publisher;
	int quantity;

	public TreeSetExample(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}

	public int compareTo(TreeSetExample b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Set<TreeSetExample> set = new TreeSet<TreeSetExample>();
		
		// Creating Books
		TreeSetExample b1 = new TreeSetExample(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		TreeSetExample b2 = new TreeSetExample(233, "Operating System", "Galvin", "Wiley", 6);
		TreeSetExample b3 = new TreeSetExample(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		
		// Adding Books to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		// Traversing TreeSet
		for (TreeSetExample b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
