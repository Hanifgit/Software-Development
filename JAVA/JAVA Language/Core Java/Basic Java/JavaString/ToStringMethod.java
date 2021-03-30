package JavaString;

public class ToStringMethod {
	int roll;
	String name;
	String city;
	
	public ToStringMethod(int roll,String name,String city) {
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return roll+" "+name+" "+city;
	}
	
	public static void main(String[] args) {
		ToStringMethod toString = new ToStringMethod(22, "Papon", "Lakshmipur");
		System.out.println(toString);
	}
}