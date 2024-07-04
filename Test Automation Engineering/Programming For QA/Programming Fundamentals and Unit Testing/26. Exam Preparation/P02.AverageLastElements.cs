using System;
using System.Linq;

class Program
{
    static void Main()
    {
        
        string inputArray = Console.ReadLine();
        int[] numbers = inputArray.Split(' ').Select(int.Parse).ToArray();

        int N = int.Parse(Console.ReadLine());
      
        double average = numbers.Skip(numbers.Length - N).Take(N).Average();

        Console.WriteLine($"{average:F2}");
    }
}
