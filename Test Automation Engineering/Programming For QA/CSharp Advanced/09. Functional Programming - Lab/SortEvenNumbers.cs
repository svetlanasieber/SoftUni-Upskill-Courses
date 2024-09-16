using System;
using System.Linq;

namespace SortEvenNumbers
{
    internal class SortEvenNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine(string.Join(", ", Console.ReadLine().Split(", ").Select(x => int.Parse(x)).Where(x => x % 2 == 0).OrderBy(x => x)));
        }
    }
}
