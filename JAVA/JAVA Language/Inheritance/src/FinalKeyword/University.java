package FinalKeyword;
/*final keyword use korle seie variable value change/modifie  kora jaie na */

//final Class ke inheritance kora jaine na
public class University {
	final String name = "BUBT";
	final int fees; //blank final variable.Blank final variable Initialization kora jaie sudu constructor dara
	static final String differment; //static blank final variable.eta Initialization kore static block dara
	
	University() {
		fees = 37000;
	}
	
	static {
		differment = "CSE";
	}
	
     void Display() {
		System.out.println(name);
		System.out.println(fees);
		System.out.println(differment);
	}
}
