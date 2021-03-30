package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<CreatingList>list = new LinkedList<CreatingList>();
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			int id = input.nextInt();
			String name = input.next();
			String Class = input.next();
			CreatingList obj = new CreatingList(id, name, Class);
			list.add(obj);
		}
		input.close();
		
//		CreatingList obj1 = new CreatingList(22, "Papon", "CSE");
//		CreatingList obj2 = new CreatingList(21, "Hanif", "CSE");
//		CreatingList obj3 = new CreatingList(22, "Sabbir", "CSE");
//		
//		list.add(obj1);
//		list.add(obj2);
//		list.add(obj3);
		
		for(CreatingList s:list) {
			System.out.println(s.id+ " "+s.name+" "+s.Class);
		}
	}
}
