using System;
using System.Collections.Generic;
using System.Linq;

namespace ListOfPredicates
{
    internal class ListOfPredicates
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            List<int> numbers = new List<int>();
            for (int i = 1; i <= number; i++)
            {
                numbers.Add(i);
            }
            List<int> dividers = Console.ReadLine().Split().Select(int.Parse).ToList();
            List<int> result = new List<int>();
            
            foreach (var num in numbers)
            {
                bool divisible = true;
                foreach (var divider in dividers)
                {
                    Predicate<int> isDivisable = num => num  % divider == 0;
                    if (!isDivisable(num))
                    {
                        divisible = false;
                        break;
                    }
                }
                if (divisible == true)
                {
                    result.Add(num);
                }
            }
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
