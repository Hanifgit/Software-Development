using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] ary = new int[5];

            for(int i = 0; i < 5; i++)
            {
                ary[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(+ ary[i]);
            }

            string[] str = new string[5];

            for(int i = 0; i < 5; i++)
            {
                str[i] = Console.ReadLine();
                Console.WriteLine("" + str[i]);
            }
        }
    }
}
