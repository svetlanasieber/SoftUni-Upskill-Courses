using System;


class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        for (int i = 1; i <= n; i++)
        {
            Console.WriteLine(i + i - 1);
        }
        Console.WriteLine($"Sum: {n * n}");
    }
}
