package ToStringMethod;

public class ToStringClass {
	String name;
	int age;
	public ToStringClass(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		//return super.toString();
		return ""+name+" "+age+"\n";
	}
}
