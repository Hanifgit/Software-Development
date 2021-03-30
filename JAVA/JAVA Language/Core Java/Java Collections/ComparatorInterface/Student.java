package ComparatorInterface;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	String name;
	int id;
	public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public Student() {

	}
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id==o2.id) return 0;
		else if(o1.id<o2.id) return -1;
		else return 1;
		
		//String Sorting
		//return o1.name.compareTo(o2.name);
	}

}
