using System;
using System.Collections.Generic;
using System.Linq;

namespace CupsAndBottles
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Queue<int> cupsQueue = new Queue<int>(Console.ReadLine().Split().Select(int.Parse).ToArray());
            Stack<int> bottlesStack = new Stack<int>(Console.ReadLine().Split().Select(int.Parse).ToArray());
            int wastedLittersOfWater = 0;
            while (true)
            {
                int currentCup = cupsQueue.Peek();
                int currentBottle = bottlesStack.Peek();
                while (currentCup > 0)
                {
                    if (currentBottle == currentCup)
                    {
                        cupsQueue.Dequeue();
                        bottlesStack.Pop();
                        break;
                    }
                    else if (currentBottle > currentCup)
                    {
                        cupsQueue.Dequeue();
                        bottlesStack.Pop();
                        wastedLittersOfWater += currentBottle - currentCup;
                        break;
                    }
                    else
                    {
                        currentCup -= currentBottle;
                        bottlesStack.Pop();
                        currentBottle = bottlesStack.Peek();
                    }
                }
                if (cupsQueue.Count == 0)
                {
                    Console.WriteLine($"Bottles: {string.Join(' ', bottlesStack)}");
                    break;
                }
                if (bottlesStack.Count == 0)
                {
                    Console.WriteLine($"Cups: {string.Join(' ', cupsQueue)}");
                    break;
                }
            }
            Console.WriteLine($"Wasted litters of water: {wastedLittersOfWater}");
        }
    }
}
