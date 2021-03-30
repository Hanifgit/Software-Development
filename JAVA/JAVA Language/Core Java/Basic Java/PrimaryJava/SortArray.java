package PrimaryJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//@SuppressWarnings("unused")

public class SortArray {
    public static void main(String[] args) {
    	
    	int[] Array = {10,-3,2,5,1};
    	Arrays.sort(Array);
    	for(int i=0;i<5;i++) {
    		System.out.print(" "+Array[i]);
    	}
    	System.out.println();
    	for(int i=4;i>=0;i--) {
    		System.out.print(" "+Array[i]);
    	}
    	System.out.println();
    	
    	String[] names = {"Papon","hridoy","Piyas"};
    	Arrays.sort(names);
    	for(int i=0;i<3;i++) {
    		System.out.print(" "+names[i]);
    	}
    	System.out.println();
    	
        ArrayList<Integer> number = new ArrayList<>();
        //ArrayList<Integer> number1 = new ArrayList<>();
        number.add(30);
        number.add(10);
        number.add(2,20);// index,value
        System.out.println(number);
        
        Collections.sort(number);
        System.out.println(number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println(number);
        
        
    }
}
