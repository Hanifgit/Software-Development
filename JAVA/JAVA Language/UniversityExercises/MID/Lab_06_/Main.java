package Lab_06_;

import java.util.ArrayList;
import java.util.Collections;

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
		
		ArrayList<Lion>lions = new ArrayList<>();
		lions.add(new Lion(190,4,"birds"));
		lions.add(new Lion(170,4,"hares"));
		lions.add(new Lion(150,4,"buffaloes"));
		lions.add(new Lion(200,4,"cheetahs"));
		Collections.sort(lions);
		
		System.out.println("\nSorting Feet: ");
		for(Lion mn: lions){
            System.out.println(mn.size+ " " + mn.feet + " " + mn.typeDiet);
        }
		
	
		ArrayList<Cow>cows = new ArrayList<>();
		cows.add(new Cow(300,4,"grass"));
		cows.add(new Cow(250,4,"corn"));
		cows.add(new Cow(400,4,"wheat"));
		cows.add(new Cow(350,4,"oats"));
		Collections.sort(cows);
		
		System.out.println("\nSorting Feet: ");
		for(Cow mn: cows){
            System.out.println(mn.size+ " " + mn.feet + " " + mn.typeDiet);
        }
		
		ArrayList<Fish>fishs = new ArrayList<>();
		fishs.add(new Fish(100,4,"Insects"));
		fishs.add(new Fish(50,6,"Vegetables"));
		fishs.add(new Fish(20,8,"Fruit"));
		fishs.add(new Fish(120,6,"Insects"));
		Collections.sort(fishs);
		
		System.out.println("\nSorting Feet: ");
		for(Fish mn: fishs){
            System.out.println(mn.size+ " " + mn.feet + " " + mn.typeDiet);
        }
	}
}
