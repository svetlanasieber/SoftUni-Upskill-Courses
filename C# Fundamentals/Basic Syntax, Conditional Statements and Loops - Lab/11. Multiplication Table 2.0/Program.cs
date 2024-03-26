using System;


class Program
{
    static void Main()
    {
        int x = int.Parse(Console.ReadLine());
        int y = int.Parse(Console.ReadLine());
        if (y < 1 || y > 10) Console.WriteLine($"{x} X {y} = {x * y}");
        for (int i = y; i <= 10; i++)
        {
            Console.WriteLine($"{x} X {i} = {x * i}");
        }
    }
}
