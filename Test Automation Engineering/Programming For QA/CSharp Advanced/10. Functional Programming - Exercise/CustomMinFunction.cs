using System;
using System.Collections.Generic;
using System.Linq;

namespace CustomMinFunction
{
    internal class CustomMinFunction
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split().Select(int.Parse).ToList();
            Func<List<int>, int> minElement = x => x.Min();
            Console.WriteLine(minElement(list));
        }
    }
}
