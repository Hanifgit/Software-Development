package MethodOverriding;

/*Method Overriding Rules
 *Name,signature type,parameter must be same
 *If a method can not be inherited,then it can't be overridden 
 *A method declared as final or static can not be overridden
 *Constructor cab not be overridden
 *Static keyword relation "class"
 * method relation "object"
 */
public class Main {
	public static void main(String[] args) {
		Teacher objTeacher = new Teacher();
		
		objTeacher.name = "Papon Ahasan";
		objTeacher.age = 24;
		objTeacher.qualification = "Bsc In CSE";
		objTeacher.Display();
	}
}
