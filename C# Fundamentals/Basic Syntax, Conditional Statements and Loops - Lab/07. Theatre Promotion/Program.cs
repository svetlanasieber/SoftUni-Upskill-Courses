using System;


class Program
{
    static void Main()
    {
        string day = Console.ReadLine();
        int age = int.Parse(Console.ReadLine());
        int[] prices = { 12, 15, 5, 18, 20, 12, 12, 15, 10 };
        int priceIndex = 0;
        if (age < 0 || age > 122)
        {
            Console.WriteLine("Error!");
            return;
        }
        else if (age > 64) priceIndex += 6;
        else if (age > 18) priceIndex += 3;

        if (day == "Weekend") priceIndex += 1;
        else if (day == "Holiday") priceIndex += 2;

        Console.WriteLine($"{prices[priceIndex]}$");
    }
}
