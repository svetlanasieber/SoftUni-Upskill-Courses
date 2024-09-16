using System;
using System.Collections.Generic;
using System.Linq;

namespace CountSymbols
{
    internal class P05CountSymbols
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            Dictionary<char, int> symbols = new Dictionary<char, int>();
            foreach (var item in input)
            {
                if (!symbols.ContainsKey(item))
                {
                    symbols.Add(item, 1);
                }
                else
                {
                    symbols[item]++;
                }
            }
            foreach (var item in symbols.OrderBy(x => x.Key))
            {
                Console.WriteLine($"{item.Key}: {item.Value} time/s");
            }
        }
    }
}
