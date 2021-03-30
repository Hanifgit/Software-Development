using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loops
{
    class Program
    {
        static void Main(string[] args)
        {
            for(int i = 1; i < 10; i++)
            {
                Console.Write(i);
            }

            //Console.WriteLine("\n");

            int j = 10;
            while (j >= 0)
            {
                Console.Write(j);
                j--;
            }

            int z = 1;
            do
            {
                Console.Write(z);
                z++;
            } while (z <= 10);
        }
    }
}
