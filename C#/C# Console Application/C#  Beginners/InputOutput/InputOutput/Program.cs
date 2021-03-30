using System;

namespace InputOutput
{
    class Program
    {
        static void Main(string[] args)
        {
            //Console.BackgroundColor = ConsoleColor.Green;
            Console.Write("Enter your User Name:");
            string UserName = Console.ReadLine();

            Console.Write("Enter your User Age:");
            string UserAge = Console.ReadLine();

            Console.WriteLine("User Name:" + UserName);
            Console.WriteLine("User Age:" + UserAge);


            int num1, num2,result;

            Console.WriteLine("Enter 1st Number:");
            string Input1 = Console.ReadLine();

            Console.WriteLine("Enter 2nd Number:");
            string Input2 = Console.ReadLine();

            num1 = Convert.ToInt32(Input1);
            num2 = Convert.ToInt32(Input2);

            result = num1 * num2;

            Console.WriteLine("Ans is:" + result);
        }
    }
}
