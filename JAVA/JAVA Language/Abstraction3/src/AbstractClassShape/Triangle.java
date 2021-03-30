package AbstractClassShape;

public class Triangle extends Shape {
	//double base,height;
	
	public Triangle(double variable1,double variable2) {
		//this.variable1 = variable1;/* this Processes don't use.
		//this.variable2 = variable2; Must use Super Keyword /*
		super(variable1, variable2);
	}
	
	@Override
	double Area() {
		return 0.5*variable1*variable2;
	}
}
