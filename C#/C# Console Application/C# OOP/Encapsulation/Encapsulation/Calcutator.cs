using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Encapsulation
{
    class Calculator
    {
        private double num1;
        private double num2;

        public Calculator(double value1, double value2)
        {
            num1 = value1;
            num2 = value2;
        }
        private double multipication()
        {
            return num1 * num2;
        }

        public void Display()
        {
            Console.WriteLine( + multipication());
        }
    }
}
