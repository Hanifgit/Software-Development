package Polymorphism_Ex_Area;

public class Rectangle extends Shape {
	 double length,width;
	 
	 Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	 @Override
	 double Area() {
		 return length*width;
	 }
}
