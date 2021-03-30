package AbstractClassShape;

public class Rectangle extends Shape {
	//double height,width;
	
	Rectangle(double variable1, double variable2) {
		//this.height = height;
		//this.width = width;
		super(variable1,variable2);
	}
	@Override
	double Area() {
		return variable1*variable2;
	}
}
