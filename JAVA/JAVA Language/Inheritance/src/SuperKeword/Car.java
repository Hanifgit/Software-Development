package SuperKeword;

public class Car extends Vehicle {
	int gear;
	
	Car(String c,double w,int g) {
		super(c, w);
		gear = g;
	}
	
	@Override
	void attribut() {
		super.attribut();
		System.out.println(gear);
	}
	
}
