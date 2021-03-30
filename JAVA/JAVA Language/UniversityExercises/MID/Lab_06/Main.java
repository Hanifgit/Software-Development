package Lab_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		Cow cow = new Cow();
		cow.breathe();
		cow.eat();
		cow.move();
		
		Fish fish = new Fish();
		fish.breathe();
		fish.eat();
		fish.move();
		
		ArrayList<Animal>animals = new ArrayList<>();
		
		animals.add(new Lion(190,4,"birds"));
		animals.add(new Lion(170,4,"hares"));
		animals.add(new Lion(150,4,"buffaloes"));
		animals.add(new Lion(200,4,"cheetahs"));
		Collections.sort(animals);
		
		Iterator<Animal>it = animals.iterator();
		System.out.println("\nSorting Feet: ");
		while (it.hasNext()) {
			Animal animal = it.next();
			System.out.println(animal.size+" "+animal.feet+" "+animal.typeDiet);
		}
		
		animals.clear();
		
		animals.add(new Cow(300,4,"grass"));
		animals.add(new Cow(250,4,"corn"));
		animals.add(new Cow(400,4,"wheat"));
		animals.add(new Cow(350,4,"oats"));
		Collections.sort(animals);
		
		Iterator<Animal>itC = animals.iterator();
		System.out.println("\nSorting Size: ");
		while (it.hasNext()) {
			Animal animal = itC.next();
			System.out.println(animal.size+" "+animal.feet+" "+animal.typeDiet);
		}
	}
}
