using System;


class Program
{
    static void Main()
    {
        while (true)
        {
            int num = int.Parse(Console.ReadLine());
            if (num % 2 == 0)
            {
                Console.WriteLine($"The number is: {Math.Abs(num)}");
                break;
            }
            Console.WriteLine("Please write an even number.");
        }
    }
}
