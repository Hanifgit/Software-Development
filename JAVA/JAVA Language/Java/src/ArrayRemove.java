import java.util.ArrayList;
@SuppressWarnings("unused")

public class ArrayRemove {
    public static void main(String[] args) {
    	ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();
         
        number.add(10);
        number.add(20);
        number.add(2,30);// index,value
        System.out.println(number);
        
        number.remove(2); //Remove Index
        System.out.println(number);
        
        boolean check = number.isEmpty();
        
        boolean ck =  number.contains(30); //array list 30 ace kina
        
        number.indexOf(20); //20 index khyje dive
        
        number.set(0,50);// Array list 0th index replace 50
        System.out.println(number);
        
        int x = number.get(1); // array list 1 index value;
        System.out.println(x);
        
        number1.addAll(number);
        System.out.println(number1);//number1 a number sove value add korbe
        
        if(number1.equals(number)){ // number1 equal number??
        	System.out.println("EQUAL");
        }
        
        number.removeAll(number);
        number.clear();
    }
}
