package MethodTakesParameters;

public class BoxDemo {
	public static void main(String[] args) {
		Box myBox = new Box();
		
		myBox.SetDim(10, 20, 15);
		System.out.println(myBox.Volume());
	}
}