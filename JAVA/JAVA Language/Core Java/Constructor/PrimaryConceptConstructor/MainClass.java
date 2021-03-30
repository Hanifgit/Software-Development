package PrimaryConceptConstructor;
public class MainClass {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Teacher tc1 = new Teacher("Papon","Male",1741885987); // Object Declare
		tc1.Print();
		
		Teacher tc2 = new Teacher("Papon","Male"); // Object Declare
		tc2.Print();
		
		Teacher tc3 = new Teacher();
		//tc3.Print();
	}
}
