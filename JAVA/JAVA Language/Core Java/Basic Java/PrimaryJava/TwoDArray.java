package PrimaryJava;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] num = new int[2][3];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                num[i][j] = input.nextInt();
            }
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
        
        input.close();
    }
}
