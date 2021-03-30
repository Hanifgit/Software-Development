import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        int len = number.length;
        System.out.println(len);
        System.out.println(number[0]);
        
        double[] num = new double[5];
        num[0] = input.nextDouble();
        for(int i=1;i<num.length;i++){
            num[i] = input.nextDouble();
        }
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum);
        
        String[] numn = {"Male","Female"};
        System.out.println(numn[0]);
        
        input.close();
    }
}
