using System;
using System.Collections.Generic;

namespace ParkingLot
{
    internal class ParkingLot
    {
        static void Main(string[] args)
        {
            string input;
            HashSet<string> set = new HashSet<string>();
            while ((input = Console.ReadLine()) != "END")
            {
                string direction = input.Split(", ")[0];
                string carNumber = input.Split(", ")[1];
                if (direction == "IN")
                    set.Add(carNumber);
                if (direction == "OUT")
                    set.Remove(carNumber);

            }
            if (set.Count != 0)
            {
                foreach (var item in set)
                    Console.WriteLine(item);
            }
            else
            {
                Console.WriteLine("Parking Lot is Empty");
            }
        }
    }
}
