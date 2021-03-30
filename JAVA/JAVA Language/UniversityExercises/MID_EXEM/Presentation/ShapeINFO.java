package Presentation;
public abstract class ShapeINFO implements Shape {
	double width,height;
	public ShapeINFO(double width,double height) {
		this.width = width;
		this.height = height;
	}
	final void MSG() {
		System.out.print("Area is : ");
	}
	public void Area() {
		MSG();
		System.out.println(width*height); 
	}
}
