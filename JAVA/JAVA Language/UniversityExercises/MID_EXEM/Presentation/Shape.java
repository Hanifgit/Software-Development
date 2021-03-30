package Presentation;
public interface Shape {
	abstract void Area();
	default public void DefaultMethod() {
		System.out.println("New default method");
	}
}
