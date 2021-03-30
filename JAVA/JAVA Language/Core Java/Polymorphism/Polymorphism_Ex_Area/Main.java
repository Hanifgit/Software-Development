package Polymorphism_Ex_Area;

public class Main {
	public static void main(String[] args) {
//		Shape shape = new Shape();
//		System.out.println(shape.Area());
//		
//		shape = new Rectangle(10, 20);
//		System.out.println(shape.Area());
//		
//		shape = new Triangle(10, 20);
//		System.out.println(shape.Area());
		
		//double[] S = new double[3];
		Shape[] S = new Shape[3];
		S[0] = new Shape();
		S[1] = new Rectangle(10, 20);
		S[2] = new Triangle(10, 20);
		
		for(int i=0;i<3;i++) System.out.println(S[i].Area());
	}
}
