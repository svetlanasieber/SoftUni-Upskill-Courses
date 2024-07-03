using System;
using System.Linq;

class MinMaxValues
{
    static void Main()
    {
        
        int[] numbers = Console.ReadLine()
            .Split(' ')
            .Select(int.Parse)
            .ToArray();

        int N = int.Parse(Console.ReadLine());

     
        if (N > 0 && N <= numbers.Length)
        {
            
            int[] firstNElements = numbers.Take(N).ToArray();

          
            int maxNumber = firstNElements.Max();
            int minNumber = firstNElements.Min();

          
            Console.WriteLine(maxNumber);
            Console.WriteLine(minNumber);
        }
        else
        {
            Console.WriteLine("Invalid input for N");
        }
    }
}
