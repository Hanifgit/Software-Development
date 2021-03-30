/* static build kore aie jeno, take access jnno kono object build korte na hoie
 * Static Method cannot use non-static method
 * "this" and "Super" keyword cannot be use here
*/
public class Static {
	int x = 0;
	static int y  = 0;
	
	//Non static method
	void Display1() {
		Display2(); //Static Method use non static method
		System.out.println("Papon Ahasan");
	}
	
	//static method
	static void Display2() {
		// Display1(); //Static Method cannot use non-static method
		//System.out.println(x); //cannot use
		System.out.println(y); // use
		System.out.println("Rakibul Ahasan");
	}
}
