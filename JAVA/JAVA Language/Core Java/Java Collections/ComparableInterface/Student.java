package ComparableInterface;

public class Student implements Comparable<Student> {
	String name;
	int id;
	public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.id==o.id) return 0;
		else if(this.id<o.id) return -1;
		else return 1;
		
		//return this.id - o.id;
		
		//String Sorting
		//return this.name.compareTo(o2.name);
	}
	
	@Override
	public String toString() {
		return name + " "+ id;
		
	}
}
