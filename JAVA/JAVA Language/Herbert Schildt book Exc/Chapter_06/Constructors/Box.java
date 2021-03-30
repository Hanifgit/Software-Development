package Constructors;

public class Box {
	double wigth;
	double height;
	double depth;
	
	double Volume() {
		return wigth * height * depth;
	}
	
	public Box(double w,double h,double d) {
		wigth = w;
		height = h;
		depth = d;
	}
	
	
}
