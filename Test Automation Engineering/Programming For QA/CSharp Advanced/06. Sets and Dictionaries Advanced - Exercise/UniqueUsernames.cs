using System;
using System.Collections.Generic;

namespace UniqueUsernames
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            HashSet<string> userName = new HashSet<string>();
            for (int i = 0; i < number; i++)
            {
                userName.Add(Console.ReadLine());
            }
            foreach (var item in userName)
            {
                Console.WriteLine(item);
            }
        }
    }
}
