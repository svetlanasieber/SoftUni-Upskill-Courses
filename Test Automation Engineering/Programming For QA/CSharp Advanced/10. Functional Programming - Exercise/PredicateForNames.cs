using System;
using System.Collections.Generic;
using System.Linq;

namespace PredicateForNames
{
    internal class PredicateForNames
    {
        static void Main(string[] args)
        {
            int wordLenght = int.Parse(Console.ReadLine());
            List<string> names = Console.ReadLine().Split().ToList();
            Func<List<string>, List<string>> printLessThanNumLen = x => x.FindAll(y => y.Length <= wordLenght).ToList();
            Console.WriteLine(string.Join(Environment.NewLine, printLessThanNumLen(names)));
        }
    }
}
