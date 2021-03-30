package Lab_02;

import java.util.Scanner;

public class PracticesEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int i,j;
		for(i=1; i<=n; i++)             
        { 
          for(j=1; j<=n; j++)
          {
               if(i==1 || j==1 || i==n/2)
            	      System.out.print("*");
               else if(i<=n/2 && j==n)
            	   System.out.print(" *");
               else if(i>n/2 && i-(n/3)==j)
            	   System.out.print("*");
               else
            	   System.out.print(" ");
          }
          
          System.out.println();
        }
         
	}
}
