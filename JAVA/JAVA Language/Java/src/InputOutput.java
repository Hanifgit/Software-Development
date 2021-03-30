import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
        System.out.println(number);
        
        char ch = input.next().charAt(0);
        System.out.println(ch);
        
        String name = input.nextLine();
        System.out.println(name);
        
        String space= input.next();
        System.out.println(space);
        
        double num = input.nextDouble();
        System.out.println(num);
        
        input.close();
	}
}
