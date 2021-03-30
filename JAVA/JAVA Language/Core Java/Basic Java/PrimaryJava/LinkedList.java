package PrimaryJava;

public class LinkedList {
	public static void main(String[] args) {
		java.util.LinkedList<String>name = new java.util.LinkedList<String>();
		name.add("Papon");
		name.add("Ahasan");
		name.add("Rakibul");
		name.add(2, "Sabbir");
		name.add(3, "Hanif");
		name.addFirst("Imran");
		name.addLast("Rahim");
		
		//name.remove("Ahasan");
		//name.remove(5);
		name.removeFirst();
		name.removeLast();
		//name.removeAll(name);
		//System.out.println(name.get(1));
		//System.out.println(name.getFirst());
		//System.out.println(name.getLast());
		//name.clear();
		System.out.println(name);
		for(String n:name) {
			System.out.println(n);
		}
		System.out.println(name.size());
	}
}
