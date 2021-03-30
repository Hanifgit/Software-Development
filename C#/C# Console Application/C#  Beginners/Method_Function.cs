using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
        int a=20;
        int b=50;
        int result=add(a,b);
        Console.WriteLine(result);
       
        Console.ReadKey();
    }
    
    static int add(int a,int b){
        int result= a+b;
        return result;
    }
  }
}