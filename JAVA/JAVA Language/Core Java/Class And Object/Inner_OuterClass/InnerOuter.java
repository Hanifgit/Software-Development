package Inner_OuterClass;

public class InnerOuter {
	
	//Non-static 
	public String name;
	public class Outer1 { // member Inner Class
		int id;
		Outer1(int id){
			this.id = id; 
		}
		void Print() {
			name = "Rahim";
			Display1();
			Display2();
		}
	}
	
	void Display1() {
		System.out.println("Rahim Is Good Boy");
	}
	
	
	//static 
	static String Nm;
	static public class Outer2 { // static member Inner Class
		int id;

		void Print() {
			Nm = "Karim";
			Display2();
		}
	}
	
	static void Display2() {
		System.out.println("karim Is Good Boy");
	}
	
}
