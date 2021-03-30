package PrimaryJava;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIst {
    	@SuppressWarnings("unused")
		public static void main(String[] args) {
    		ArrayList<Integer>number = new ArrayList<Integer>();

    		number.add(20);
    		number.add(10);
    		boolean add = number.add(30);
    		
    		System.out.println(number.size());
    		System.out.println(number);
    		
    		Iterator<Integer> it = number.iterator();
            while(it.hasNext()){
                System.out.println(" "+it.next());
            }
            for(int i:number){
                System.out.println(" "+i);
            }
            
            number.forEach((i) -> {
                System.out.println(" "+i);
            });
            System.out.println(number);
    	}
}
