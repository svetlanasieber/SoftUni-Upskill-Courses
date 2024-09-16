using System;
using System.Collections.Generic;
using System.Linq;

namespace EvenTimes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int, int> evenTimes = new Dictionary<int, int>();
            int number = int.Parse(Console.ReadLine());
            for (int i = 0; i < number; i++)
            {
                int input = int.Parse(Console.ReadLine());
                if (!evenTimes.ContainsKey(input))
                    evenTimes.Add(input, 1);
                else
                evenTimes[input]++;
            }
            foreach (var item in evenTimes)
            {
                if (item.Value % 2 == 0)
                {
                    Console.WriteLine(item.Key);
                }
            }

        }
    }
}
