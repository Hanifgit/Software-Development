package AbstractClassShape;

public class Circle extends Shape {
	//double radius;
	
	public Circle(double variable1) {
		super(variable1, variable1);
	}
	
	@Override
	double Area() {
		return Math.PI*Math.pow(variable1, 2);
	}
}
