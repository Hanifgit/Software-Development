using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
         /* string */
        string str = Console.ReadLine();
        Console.WriteLine("OutPut:"+ str);
        
         /* Integer Number */
       // Console.Write("Enter The Number:");
        Console.WriteLine("Enter The Number:");
        int n = Convert.ToInt32(Console.ReadLine());
        // n= n+11;
        Console.WriteLine("OutPut:"+ (n+ 11));
        
        /* Fractional Numbers */
        double d= Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("OutPut:"+ d);
         
        Console.ReadLine();
    }
  }
}