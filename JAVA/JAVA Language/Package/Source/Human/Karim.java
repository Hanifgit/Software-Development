package Human;

import Animal.Mouse;

public class Karim {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Rahim rahim = new Rahim();
		
		Cat cat = new Cat();//Human Package Cat class
		Animal.Cat cat1 = new Animal.Cat(); //Animal Package Cat class
		
		Mouse mouse = new Mouse();
		mouse.Method(); // method class Animal Class Method.And public
	}
}
