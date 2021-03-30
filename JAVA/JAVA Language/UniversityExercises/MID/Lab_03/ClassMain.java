package Lab_03;

import java.util.Scanner;

public class ClassMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Box obBox1 = new Box();
		//System.out.println(obBox1.Display());
		System.out.print("Enter Height And weight: ");
		Box obBox2 = new Box(input.nextDouble(),input.nextDouble());
		System.out.println(obBox2.Display1());
		
		System.out.print("Enter Height And weight And Depth: ");
		Box obBox3 = new Box(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println("Volume is : " +obBox3.Display2());
		
		input.close();
	}
}
