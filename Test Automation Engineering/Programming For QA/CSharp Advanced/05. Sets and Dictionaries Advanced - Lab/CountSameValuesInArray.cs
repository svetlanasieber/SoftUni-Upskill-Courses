using System;
using System.Collections.Generic;
using System.Linq;

namespace CountSameValuesInArray
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double[] input = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries).Select(double.Parse).ToArray();
            Dictionary<double,int> dictWithValue = new Dictionary<double,int>();
            foreach (var item in input)
            {
                if (!dictWithValue.ContainsKey(item))
                {
                    dictWithValue.Add(item, 1);
                }
                else
                {
                    dictWithValue[item]++;
                }
            }
            foreach (var item in dictWithValue)
            {
                Console.WriteLine($"{item.Key} - {item.Value} times");
            }
        }
    }
}
