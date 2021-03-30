
public class Main {
	public static void main(String[] args) {
		CallByValueORreference obj = new CallByValueORreference();
		
		//Call By Value
		int i = 10;
		System.out.println(""+i);
		
		obj.Value(i);
		System.out.println(""+i);
		
		//Call By Reference
		obj.nameString = "Rakibul";
		System.out.println(obj.nameString);
		
		obj.Rreference(obj);
		System.out.println(obj.nameString);
	}
}
