package PrimaryJava;

public class MathClass {
	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		int z = -30;
		
		int mx = Math.max(x, y);
		System.out.println(mx);
		
		int mn = Math.min(x, y);
		System.out.println(mn);
		
		int Abs = Math.abs(z);
		System.out.println(Abs);
		
		double power = Math.pow(x,y);
		System.out.println(power);
		
		double round = Math.round(8.4f);
		System.out.println(round);
		
		System.out.println(Math.PI);
	}
}
