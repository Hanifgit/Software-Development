using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
        int i=10;
        long l=1000;
         i=l; // Not Possible.Cause integer Assign Long
        i=Convert.ToInt32(l); // Possible.Cause Long Convert To Integer
        l=i;  // Possible.Cause Long Assign Integer
        
        bool b=true;
        i= Convert.ToInt32(b);
        
        char c='a';
        l=c;  // Possible.Convert Ascii value
        
         Console.WriteLine(l);
       
         Console.ReadKey();
    }
  }
}