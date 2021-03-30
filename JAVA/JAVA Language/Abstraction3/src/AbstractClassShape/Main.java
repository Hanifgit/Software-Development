package AbstractClassShape;

public class Main {
	public static void main(String[] args) {
		Shape rVariable;
		
		rVariable = new Rectangle(10.5,6);
		System.out.println(rVariable.Area());
		
		rVariable = new Triangle(10.5,6);
		System.out.println(rVariable.Area());
		
		rVariable = new Circle(10.5);
		System.out.println(rVariable.Area());
		System.out.printf("%.2f\n",rVariable.Area());
	}
}
