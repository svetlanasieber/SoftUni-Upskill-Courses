using System;
using System.Collections.Generic;
using System.Linq;

namespace TruckTour
{
    internal class Program
    {
        static void Main()
        {
            int petrolPumpsCount = int.Parse(Console.ReadLine());
            Queue<long> diffDistancePetrol = new Queue<long>();
            for (int i = 0; i < petrolPumpsCount; i++)
            {
                int[] input = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
                diffDistancePetrol.Enqueue(input[0] - input[1]);
            }
            for (int i = 0; i < petrolPumpsCount; i++)
            {
                long availablePetrol = 0;
                bool successful = true;

                foreach (var item in diffDistancePetrol)
                {
                    availablePetrol += item;
                    if (availablePetrol < 0)
                    {
                        successful = false;
                        break;
                    }
                }
                if (successful)
                {
                    Console.WriteLine(i);
                    break;
                }
                else
                {
                    diffDistancePetrol.Enqueue(diffDistancePetrol.Dequeue());
                }
            }
        }
    }
}
