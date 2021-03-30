package Lab_06;

public class Lion extends Animal {

	public Lion(int size,int feet,String typeDiet) {
		this.size = size;
		this.feet = feet;
		this.typeDiet = typeDiet;
	}
	
	@Override
	void breathe() {
		System.out.println("lion's breath up to 7 times");
	}

	@Override
	void eat() {
		System.out.println("Lions eats antelopes, buffaloes, zebras, young elephants, rhinos, hippos, wild hogs, crocodiles and giraffes etc");
		
	}

	@Override
	void move() {
		System.out.println("The lions can only run fast for a short time.");
		
	}

	@Override
	public int compareTo(Animal o) {
		if(this.size==o.size) return 0;
		else if(this.size<o.size) return -1;
		else return 1;
	}


}
