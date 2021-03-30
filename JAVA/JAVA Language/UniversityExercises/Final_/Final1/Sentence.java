package Final1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		Sentence countWordTest = new Sentence();
        countWordTest.countWords(str);
		input.close();
	}
	
	public void countWords(String input) {
        Map <String, String> map = new HashMap <String, String> ();
 
        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
            	System.out.println("'"+str+"'"+" Length: "+str.length());
                if (map.containsKey(str)) {
                    int count = Integer.parseInt(map.get(str));
                    map.put(str, String.valueOf(count + 1));
                } else {
                    map.put(str, "1");
                }
            }
        }
        System.out.println("Count :- " + map);
    }
}
