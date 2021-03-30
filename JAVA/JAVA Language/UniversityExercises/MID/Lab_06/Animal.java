package Lab_06;

public abstract class Animal implements Comparable<Animal> {
	public int size;
	int feet;
	public String typeDiet;
	
	public Animal(int size,int feet,String typeDiet) {
		this.size = size;
		this.feet = feet;
		this.typeDiet = typeDiet;
	}
	
	public Animal() {
		System.out.println("This is Animal Constructor");
	}

	abstract void breathe(); 
	abstract void eat();
	abstract void move();

}
