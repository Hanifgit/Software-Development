import java.util.Scanner;
@SuppressWarnings("resource")

public class ForEachLoop {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        String[] str = new String[3];
        int i;
        for(i=0;i<str.length;i++){
           str[i] = input.nextLine();
        }
        
        for(String x:str){
            System.out.println(x);
        }
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        for(char x:vowels){
            System.out.println(x);
        }
        input.close();
    }
}
