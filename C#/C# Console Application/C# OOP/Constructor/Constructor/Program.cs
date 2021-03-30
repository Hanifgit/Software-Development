using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor
{

    //  Constructor have No return type
    // Constructor Always Public
    class Program
    {
        class calcutater
        {
            private double num1, num2, result;
            public calcutater(double input1,double input2)
            {
                num1 = input1;
                num2 = input2;
                result = num1 * num2;
                Console.WriteLine(+result);
            }
        } 
        static void Main(string[] args)
        {
            double input1 = 10.43, input2 = 33.54;
            calcutater obj = new calcutater(input1,input2);
        }
    }
}
