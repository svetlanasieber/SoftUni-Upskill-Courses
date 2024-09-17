using System;
using System.Collections.Generic;
using System.Linq;

namespace AppliedArithmetics
{
    internal class AppliedArithmetics
    {
        static void Main(string[] args)
        {
            List<int> listOfNumbers= Console.ReadLine().Split().Select(int.Parse).ToList();
            string command = string.Empty;
            Func<List<int>, List<int>> operation = null;
            Action<List<int>> print = x => Console.WriteLine(string.Join(" ", x)); ;    
            while ((command = Console.ReadLine()) != "end")
            {
                if (command == "add")
                {
                    operation = x => x.Select(element => element += 1).ToList();
                    listOfNumbers= operation(listOfNumbers);
                }
                else if (command == "multiply")
                {
                    operation = x => x.Select(element => element *= 2).ToList();
                    listOfNumbers = operation(listOfNumbers);
                }
                else if (command == "subtract")
                {
                    operation = x => x.Select(element => element -= 1).ToList();
                    listOfNumbers = operation(listOfNumbers);
                }
                else if (command == "print")
                {
                    print(listOfNumbers);
                }
            }
        }
    }
}
