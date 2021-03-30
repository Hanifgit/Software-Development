package Presentation;
public class TriAngle extends ShapeINFO {

	public TriAngle(double width, double height) {
		super(width, height);
	}
	@Override
	public void Area() {
		MSG();
		System.out.println(0.5*width*height); 
	}
}
