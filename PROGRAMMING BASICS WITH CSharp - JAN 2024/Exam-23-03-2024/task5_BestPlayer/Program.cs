using System;

class MainClass
{
    public static void Main(string[] args)
    {
        string command = Console.ReadLine();

        string bestPlayer = "";
        int bestScore = 0;

        while (command != "END")
        {
            string playerName = command;
            int count_of_goals = int.Parse(Console.ReadLine());

            if (count_of_goals > bestScore)
            {
                bestScore = count_of_goals;
                bestPlayer = playerName;
            }

            if (count_of_goals >= 10)
            {
                break;
            }

            command = Console.ReadLine();
        }

        Console.WriteLine($"{bestPlayer} is the best player!");

        if (bestScore >= 3)
        {
            Console.WriteLine($"He has scored {bestScore} goals and made a hat-trick !!!");
        }
        else
        {
            Console.WriteLine($"He has scored {bestScore} goals.");
        }
    }
}


