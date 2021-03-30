using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
        int size=10;
        int[] numbers = new int[size];
        
        for(int i=1;i<=size;i++){
            numbers[i-1]=i;
        }
        
        for(int i=0;i<size;i++){
            if(numbers[i]%2==0)
              Console.WriteLine(numbers[i]);
        }
       
         Console.ReadKey();
    }
  }
}