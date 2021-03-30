package Presentation;
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(2.3,3.1);
		Rectangle obj2 = new Rectangle();
		obj2.height = 15.45;
		obj2.width = 12.50;
		obj2.Area();
		TriAngle objTri = new TriAngle(10.4, 5.6);
		objTri.Area();
		Shape objShape = new Shape() {
			@Override
			public void Area() {
				System.out.println("Anonymous_Class");
			}
		};	
	}
}

