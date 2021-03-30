package Final2;

import java.util.Scanner;

public class CallClass {
	public static String para;
    public static int len = 0, numberOfWords = 1;
    
    public static void countWord(){
        System.out.println("Para: "+para);
        len = para.length();
        System.out.println("Length: "+len);
        for(int i=0; i<para.length(); i++){
            if(para.charAt(i) == ' '){
                numberOfWords++;
            }
        }
    }
    
    public static void getOccurance(){
        System.out.println("I am in getOccurance");
        int[] occurance = new int[numberOfWords];
        for(int i=0; i<numberOfWords; i++){
            occurance[i] = 0;
        }
        System.out.println("Done");
        
        String tempPara[] = para.split(" ");
        System.out.println("TempPara Length: "+tempPara.length);
        
//        for(int i=0; i<numberOfWords; i++){
//            System.out.println(tempPara[i]);
//            //System.out.println("I");
//        }
        for(int i=0; i<tempPara.length; i++){
            String wrd = tempPara[i];
            for(int j=0; j<tempPara.length; j++){
                if(wrd.equals(tempPara[j])){
                    occurance[i]++;
                }
            }
        }
        
        for(int i=0; i<tempPara.length; i++){
            System.out.println(tempPara[i] +"-->"+ occurance[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter your paragraph: ");
        
        para = " Hello, I am Mohammad Sabbir Ahmed. I am 23 years old.";
        //para = scn.nextLine();
        System.out.println("\'"+para+"\'");
        para = para.trim();
        System.out.println("\'"+para+"\'");
        countWord();
        System.out.println("Len: "+numberOfWords);
        
        getOccurance();
        scn.close();
    }
}
