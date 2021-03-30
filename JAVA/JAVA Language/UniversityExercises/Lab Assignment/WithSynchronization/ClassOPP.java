package WithSynchronization;

public class ClassOPP extends Thread {
	private String nameString;
	private int age;
	private boolean Check;
	
	public ClassOPP(String nameString,int age) {
		this.nameString = nameString;
		this.age = age;
	}
	
	public boolean isCheck() {
		return Check;
	}
	public void setCheck(boolean check) {
		Check = check;
	}
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	MethodClass p1 = new MethodClass() {
		void Method() {
			synchronized (this) {
				System.out.println(nameString);
				System.out.println(age);
			}
		}
	};
	@Override
	public void run() {
		p1.Method();
	}
}
