using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
        /* Array of string */
        string[] names = new string[10];
        names[0]="Papon";
        names[1]="Hanif";
        names[3]="sabbir";
        Console.WriteLine(names[1]);

       /* Array of  Integer or Number Array */
        //int[] number = new int[3] {5,20,10};
        int[] number = new int[10];
        number[0]=5;
        number[1]=20;
        number[3]=10;
        Console.WriteLine(number[1]);
       
         Console.ReadKey();
    }
  }
}