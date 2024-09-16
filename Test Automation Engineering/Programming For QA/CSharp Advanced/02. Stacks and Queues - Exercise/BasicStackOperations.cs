using System;
using System.Collections.Generic;
using System.Linq;

namespace BasicStackOperations
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] input = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
            int numberToPush = input[0];
            int numberToPop = input[1];
            int numberToSearch = input[2];
            Stack<int> stack = new Stack<int>();
            int[] elementsToPush = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
            for (int i = 0; i < numberToPush; i++)
            {
                stack.Push(elementsToPush[i]);
            }
            for (int i = 0; i < numberToPop; i++)
            {
                stack.Pop();
            }
            if (stack.Count == 0)
            {
                Console.WriteLine("0");
            }
            else if (stack.Contains(numberToSearch))
            {
                Console.WriteLine("true");
            }
            else
            {
                Console.WriteLine(stack.Min());
            }
        }
    }
}
