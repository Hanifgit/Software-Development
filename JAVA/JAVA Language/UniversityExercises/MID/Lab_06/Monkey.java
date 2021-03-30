package Lab_06;

public class Monkey extends Animal {

	@Override
	void breathe() {
		System.out.println();
		
	}

	@Override
	void eat() {
		System.out.println();
		
	}

	@Override
	void move() {
		System.out.println();
		
	}

	@Override
	public int compareTo(Animal o) {
		if(this.size==o.size) return 0;
		else if(this.size<o.size) return -1;
		else return 1;
	}

}
