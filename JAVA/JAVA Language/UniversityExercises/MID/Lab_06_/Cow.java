package Lab_06_;

public class Cow extends Animal {
	
	public Cow(int size,int feet,String typeDiet) {
		this.size = size;
		this.feet = feet;
		this.typeDiet = typeDiet;
	}
	
	public Cow() {
		System.out.println("This is Cow Constructor");
	}

	@Override
	void breathe() {
		System.out.println("\nCan a cow breathe through its mouth");
		
	}

	@Override
	void eat() {
		System.out.println("Cow eats Grass");
		
	}

	@Override
	void move() {
		System.out.println("Cows move in hurried and unpredictable ways\n");
		
	}
	
}
