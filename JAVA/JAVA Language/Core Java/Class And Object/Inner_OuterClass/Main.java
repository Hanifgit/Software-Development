package Inner_OuterClass;

public class Main {
	public static void main(String[] args) {
		InnerOuter objInnerOuter = new InnerOuter();
		
		//Non-static Outer Class object create
		InnerOuter.Outer1 objOuter1 = objInnerOuter.new Outer1(22);
		//InnerOuter.Outer1 objOuter1 = new InnerOuter().new Outer1();
		objOuter1.Print();
		System.out.println(objInnerOuter.name);
		System.out.println(objOuter1.id);
		
		//static Outer Class object create
		InnerOuter.Outer2 obOuter2 = new InnerOuter.Outer2();
		obOuter2.Print();
	}
}
