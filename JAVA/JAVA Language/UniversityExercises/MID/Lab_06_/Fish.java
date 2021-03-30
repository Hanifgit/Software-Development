package Lab_06_;

public class Fish extends Animal {

	public Fish(int size,int feet,String typeDiet) {
		this.size = size;
		this.feet = feet;
		this.typeDiet = typeDiet;
	}
	
	public Fish() {
		System.out.println("This is Fish Constructor");
	}
	
	@Override
	void breathe() {
		System.out.println("\nCan a fish breathe through its mouth");
		
	}

	@Override
	void eat() {
		System.out.println("Fish eats Insects ,Vegetables and Fruit etc");
		
	}

	@Override
	void move() {
		System.out.println("Fish swim by flexing their bodies and tail back and forth.\n");
		
	}
	
}
