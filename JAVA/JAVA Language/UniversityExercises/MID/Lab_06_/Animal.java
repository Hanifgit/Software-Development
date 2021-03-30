package Lab_06_;

public abstract class Animal implements Comparable<Animal> {
	int size;
	int feet;
    String typeDiet;
	
	public Animal(int size,int feet,String typeDiet) {
		this.size = size;
		this.feet = feet;
		this.typeDiet = typeDiet;
	}
	
	public Animal() {
		//System.out.println("This is Animal Constructor");
	}

	abstract void breathe(); 
	abstract void eat();
	abstract void move();
	
	@Override
	public int compareTo(Animal o) {
		if(this.size==o.size) return 0;
		else if(this.size<o.size) return -1;
		else return 1;
	}
}
