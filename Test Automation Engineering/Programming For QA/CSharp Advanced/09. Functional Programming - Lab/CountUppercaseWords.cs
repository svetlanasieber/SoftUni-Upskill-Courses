using System;
using System.Linq;

namespace CountUppercaseWords
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Func<String, bool> isFirstLetterCapital = x => x.Length > 0 && char.IsUpper(x[0]);
            //Predicate<string> isFirstLetterCapital = x => x[0] == x.ToUpper()[0];
            string[] words = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries).Where(x => isFirstLetterCapital(x)).ToArray();

            Console.WriteLine(string.Join(Environment.NewLine, words));
        }
    }
}
