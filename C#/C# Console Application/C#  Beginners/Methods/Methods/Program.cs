using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods
{
    class Program
    {
        public static void multiplication()
        {
            double num1 = 10, num2 = 20;
            double result = num1*num2;
            Console.WriteLine(+result);
        }

        public void Multiplication()
        {
            double num1 = 10, num2 = 20;
            double result = num1 * num2;
            Console.WriteLine(+result);
        }

        public static double add1(double num1, double num2)
        {
            return num1 + num2;
        }
        public double add2(double num1,double num2)
        {
            return num1 + num2;
        }
        static void Main(string[] args)
        {
            // without return First way call method
            multiplication();

            // without return second way call method
            Program obj = new Program();
            obj.Multiplication();

            // return method First way call method
            double num1 = 10.34, num2 = 20.30, result1;

            result1 = add1(num1, num2);
            Console.WriteLine("Sum is: " + result1);

            // return method second way call method
            double num3 = 10.34, num4 = 20.30,result2;

            Program obj2 = new Program();
            result2 =obj2.add2(num3,num4);
            Console.WriteLine("Sum is: "+result2);
        }
    }
}
