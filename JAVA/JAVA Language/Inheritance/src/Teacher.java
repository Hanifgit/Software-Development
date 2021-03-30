//Child,sub,derived Class
public class Teacher extends Person {
	private String qualification;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	 public void Display2() {
		  Display1();
		  System.out.println(qualification);
	  }
	
}
