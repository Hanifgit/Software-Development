package Lab_03;

public class Box {
	private double height;
	private double weight;
    private double depth;
	
	public Box() {
		System.out.println("Constructor Calling......");
		height=weight=depth=0;
	}
	
	/*Two Parameter*/
	public Box(double height,double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	/*Three Parameter*/
	public Box(double height,double weight,double depth) {
		this.height = height;
		this.weight = weight;
		this.depth = depth;
	}
	
	/*Display Two Parameter*/
	double Display1() {
		return height*weight;
	}
	
	/*Display Three Parameter*/
	double Display2() {
		return height*weight*depth;
	}
}