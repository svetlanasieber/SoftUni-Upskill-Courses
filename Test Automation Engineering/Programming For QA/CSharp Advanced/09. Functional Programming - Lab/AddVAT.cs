using System;
using System.Linq;

namespace AddVAT
{
    internal class AddVAT
    {
        static void Main(string[] args)
        {
            Func<decimal, decimal> addVat = (decimal x) => x * 1.2m;
            Func<string, decimal> parser = x => decimal.Parse(x);

            decimal[] prices = Console.ReadLine().Split(", ").Select(parser).ToArray();
            decimal[] pricesWithVat = prices.Select(addVat).ToArray();

            Array.ForEach(pricesWithVat, x => Console.WriteLine($"{x:f2}"));
        }
    }
}
