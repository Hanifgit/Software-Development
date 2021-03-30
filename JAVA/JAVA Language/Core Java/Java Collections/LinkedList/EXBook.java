package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class EXBook {
	int id;
	String name, author, publisher;
	int quantity;

	public EXBook(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		// Creating list of Books
		List<EXBook> list = new LinkedList<EXBook>();
		// Creating Books
		EXBook b1 = new EXBook(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		EXBook b2 = new EXBook(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		EXBook b3 = new EXBook(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (EXBook b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
