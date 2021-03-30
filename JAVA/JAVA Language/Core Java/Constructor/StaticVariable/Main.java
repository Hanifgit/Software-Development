package StaticVariable;

public class Main {
	public static void main(String[] args) {
		/* OneStatic Class*/
		OneStatic obj = new OneStatic("Papon",22);
		obj.Display();
		
		/*Static Variable jnno Class object build korte hoie na,
		Static variable class name sate use korte parbo.Eta Class name related*/
		System.out.println(OneStatic.university);
		
		
		
		/*Static Class*/
		Static static1 = new Static();
		static1.Display();
		
		Static static2 = new Static();
		static2.Display();
		
		Static static3 = new Static();
		static3.Display();
	}
}
