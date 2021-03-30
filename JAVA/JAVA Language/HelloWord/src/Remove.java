import java.util.Arrays;
import java.util.Scanner;

public class Remove {
	
	public static String removeCharacters(String str) {
		StringBuilder builder = new StringBuilder(str); 
		// use StringBuilder for memory optimization

		for (int i = 0; i < builder.length(); i++) {
			int foundCount_b = 0,foundCount_B = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (builder.charAt(i) == builder.charAt(j) && builder.charAt(j)=='b') {
					foundCount_b++;
					if (foundCount_b >= 1) {
						builder.deleteCharAt(i);
						i--;
						foundCount_b = 0;
						foundCount_B = 0;
					}
				}else if(builder.charAt(i) == builder.charAt(j) && builder.charAt(j)=='B') {
					foundCount_B++;
					if (foundCount_B >= 2) {
						builder.deleteCharAt(i);
						builder.deleteCharAt(j);
						i-=2;
						foundCount_b = 0;
						foundCount_B = 0;
					}
				}else {
					break;
				}
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		//char S1[] = "geeksforgeeks".toCharArray();
		//removeDuplicates(S1);
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String str = removeCharacters(name);
		//str = removeCharacters("aabccccabbadewed", 1);
		System.out.println(str);
	}
}
