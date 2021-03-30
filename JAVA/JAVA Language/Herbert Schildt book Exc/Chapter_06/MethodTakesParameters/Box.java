package MethodTakesParameters;

public class Box {
	double wigth;
	double height;
	double depth;

	double Volume() {
		return wigth * height * depth;
	}
	
	void SetDim(double w,double h,double d) {
		wigth = w;
		height = h;
		depth = d;
	}
}
