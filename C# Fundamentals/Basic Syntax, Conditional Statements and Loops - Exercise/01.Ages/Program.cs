using System;


class Program
{
    static void Main()
    {
        int num = int.Parse(Console.ReadLine());
        string output = "elder";
        int[] age = { 2, 13, 19, 65 };
        string[] category = { "baby", "child", "teenager", "adult" };

        for (int i = 0; i < 4; i++)
            if (num <= age[i])
            {
                output = category[i];
                break;
            }
        Console.WriteLine(output);
    }
}
