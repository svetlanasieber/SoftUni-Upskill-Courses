using System;
using System.Collections.Generic;
using System.Linq;

namespace FindEvensOrOdds
{
    internal class FindEvensOrOdds
    {
        static void Main(string[] args)
        {
            int[] range = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int startRange = range[0];
            int endRange = range[1];
            string condition = Console.ReadLine();
            List<int> list = new List<int>();
            for (int i = startRange; i <= endRange; i++)
            {
                list.Add(i);
            }
            Predicate<int> predicate = null;
            if (condition == "odd")
            {
                predicate = x => x % 2 != 0;
            }
            else if (condition == "even")
            {
                predicate = x => x % 2 == 0;
            }
            Console.WriteLine(string.Join(" ", list.FindAll(predicate)));
        }
    }
}
