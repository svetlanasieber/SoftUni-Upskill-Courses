using System;

namespace SantasHoliday
{
    class Program
    {
        static void Main(string[] args)
        {
            int daysStay = int.Parse(Console.ReadLine());
            string typeOfRoom = Console.ReadLine();
            string rate = Console.ReadLine();

            double discount = 0;
            double price = 0;

            switch (typeOfRoom)
            {
                case "room for one person":
                    discount = 0;
                    price = 18;
                    break;
                case "apartment":
                    price = 25;
                    if (daysStay < 10)
                    {
                        discount = 0.3;
                    }
                    else if (daysStay >= 10 && daysStay <= 15)
                    {
                        discount = 0.35;
                    }
                    else
                    {
                        discount = 0.5;
                    }
                    break;
                case "president apartment":
                    price = 35;
                    if (daysStay < 10)
                    {
                        discount = 0.1;
                    }
                    else if (daysStay >= 10 && daysStay <= 15)
                    {
                        discount = 0.15;
                    }
                    else
                    {
                        discount = 0.2;
                    }
                    break;
            }

            price = price * (daysStay - 1);
            price -= (discount * price);

            if (rate == "positive")
            {
                price += (0.25 * price);
            }
            else if (rate == "negative")
            {
                price -= (0.1 * price);
            }

            Console.WriteLine($"{price:f2}");
        }
    }
}
