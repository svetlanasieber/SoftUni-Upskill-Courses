using System;
using System.Collections.Generic;
using System.Linq;

namespace ReverseAndExclude
{
    internal class ReverseAndExclude
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split().Select(int.Parse).ToList();
            int divider = int.Parse(Console.ReadLine());
            list.Reverse();
            Predicate<int> isDivisible = x => x % divider != 0;
            Console.WriteLine(string.Join(" ", list.FindAll(isDivisible)));
        }
    }
}
