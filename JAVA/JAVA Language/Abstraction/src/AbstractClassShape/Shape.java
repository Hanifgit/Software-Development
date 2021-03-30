package AbstractClassShape;

public abstract class Shape {
	double variable1,variable2;
	
	public Shape(double variable1,double variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}
	abstract double Area();
}
