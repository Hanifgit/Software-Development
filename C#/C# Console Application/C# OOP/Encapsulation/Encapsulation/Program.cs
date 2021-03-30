using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Encapsulation
{
    class Program
    {
        static void Main(string[] args)
        {
            double n1, n2;
            Console.Write("Enter 1st Number: ");
            n1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Enter 2st Number: ");
            n2 = Convert.ToDouble(Console.ReadLine());

            Calculator obj = new Calculator(n1,n2);
            obj.Display();
        }
    }
}
