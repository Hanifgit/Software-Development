public class CallByValueORreference {
	String nameString;
	
	void Value(int x) {
		x = 10;
	}
	
	void Rreference(CallByValueORreference x) {
		x.nameString = "Ahasan";
	}
}
