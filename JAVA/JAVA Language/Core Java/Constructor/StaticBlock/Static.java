package StaticBlock;

public class Static {
	static int id;
	static String name;
	
	static {
		id = 101;
		name = "Papon";
	}
	
	static void Display() {
		System.out.println(id);
		System.out.println(name);
	}
}
