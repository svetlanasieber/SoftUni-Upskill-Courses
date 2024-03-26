using System;

class MainClass
{
    public static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        double totalSales = 0;
        double totalRating = 0;

        for (int i = 0; i < n; i++)
        {
            int computerData = int.Parse(Console.ReadLine());
            int sales = computerData / 10;
            int rating = computerData % 10;

            switch (rating)
            {
                case 2:
                    totalSales += sales * 0.0;
                    break;
                case 3:
                    totalSales += sales * 0.5;
                    break;
                case 4:
                    totalSales += sales * 0.7;
                    break;
                case 5:
                    totalSales += sales * 0.85;
                    break;
                case 6:
                    totalSales += sales * 1.0;
                    break;
            }

            totalRating += rating;
        }

        double averageRating = totalRating / n;

        Console.WriteLine($"{totalSales:F2}");
        Console.WriteLine($"{averageRating:F2}");
    }
}


