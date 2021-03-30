package CollectionsClassMethod;

import java.util.*;

public class CollectionsExample {
	public static void main(String[] args) {
		/*addAll()*/
		List<String> list = new ArrayList<String>();
		list.add("Rahul");  
	    list.add("Karthik");
	    Collections.addAll(list, "Rahul", "OM", "Prem");
	    System.out.println("Collection Value: "+list);  
	    
	    /*binarySearch()*/
	    int index = Collections.binarySearch(list, "Karthik");       
        System.out.println("index available at position: "+index);
        index = Collections.binarySearch(list, "Rahul",  Collections.reverseOrder());       
        System.out.println("Index available at position: "+index); 
        
        /*SortedMap()*/
        SortedMap<String, Integer> smap = new TreeMap<String, Integer>();
        smap.put("JavaTpoint", 1100);  
        smap.put("Hindi100", 500);  
        smap.put("SSSIT", 1300);  
        smap.put("ABCD", 1200);         
        System.out.println("Type safe view of the Sorted Map is: "+Collections.checkedSortedMap(smap,String.class,Integer.class)); 
        
        /*SortedSet()*/
        TreeSet<Integer> set = new TreeSet<>();   
        set.add(1100);  
        set.add(100);  
        set.add(500);  
        set.add(200); 
        System.out.println("Type safe view of the Sorted Set is: "+Collections.checkedSortedSet(set,Integer.class)); 
        
        /*copy()*/
        List<String> srclist = new ArrayList<String>(5);  
        List<String> destlist = new ArrayList<String>(10);  
        srclist.add("Java Tutorial");  
        srclist.add("is best on");  
        srclist.add("JavaTpoint");  
        destlist.add("JavaTpoint");
        destlist.add("is older than");  
        destlist.add("SSSIT");
        Collections.copy(destlist, srclist);              
        System.out.println("Elements of source list: "+srclist);  
        System.out.println("Elements of destination list: "+destlist);
        
        /*disjoint()*/
        List<String> list1 = new ArrayList<String>(5);  
        List<String> list2 = new ArrayList<String>(10);
        list1.add("Java");  
        list1.add("PHP");  
        list1.add("JavaScript");  
        list2.add("C++");  
        list2.add("C");  
        list2.add("C#");
        //It returns true if no elements are common.  
        boolean iscommon = Collections.disjoint(list1, list2 );  
        System.out.println("Output: "+iscommon);
        
        List<Integer> list3 = Arrays.asList(10, 20, 30, 40);  
        List<Integer> list4 = Arrays.asList(10, 20, 30, 4, 5, 6);  
        boolean b = Collections.disjoint(list3, list4);  
        System.out.println("Output: "+b); 
        
        /*fill()*/
        Collections.fill(list,"JavaTpoint");  
        System.out.println("List elements after Replacements: "+list);
        
        /*frequency()*/
        List<String> arrlist = new ArrayList<String>();  
        arrlist.add("Java");  
        arrlist.add("COBOL");  
        arrlist.add("Java");  
        arrlist.add("C++");  
        arrlist.add("Java"); 
        System.out.println("Frequency of the Word: "+Collections.frequency(arrlist,"Java"));
        for (String i : arrlist) {  
            System.out.println(i + ": " + Collections.frequency(arrlist, i));  
       } 
        
        /*MAX(),MIN()*/
        List<String> lis = new ArrayList<String>();          
        lis.add("A");  
        lis.add("B");  
        lis.add("E");  
        lis.add("C");  
        lis.add("S");
        System.out.println("Max val: " + Collections.max(lis,null));
        System.out.println("maximum element :"+Collections.max(lis));
        System.out.println("Mininum character is: " + Collections.min(lis,null));
        System.out.println("maximum element :"+Collections.min(lis));
	}
}
