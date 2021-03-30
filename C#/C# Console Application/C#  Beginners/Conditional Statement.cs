using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
        /* Conditions and If Statements */
         int time=Convert.ToInt32(Console.ReadLine()); // Read this time
         //int time = 20;
         if (time < 18) {
             Console.WriteLine("Good day.");
         }
         else{
             Console.WriteLine("Good evening.");
         }
         
         /*Another Way */
         int hour = 20;
         string Ans = String.Empty;
         if (hour < 18) {
             Ans="Good day.";
         }
         else{
             Ans="Good evening.";
         }
         Console.WriteLine(Ans);
         
         /* Ternary Operator */
         // variable = (condition) ? expressionTrue :  expressionFalse;
         int day = 20;
         string result = (day < 18) ? "Good day." : "Good evening.";
         Console.WriteLine(result);

         Console.ReadLine();
    }
  }
}