using System;
using System.Collections.Generic;
using System.Linq;

namespace ForceBook
{
    internal class ForceBook
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> usersAndSides = new Dictionary<string, string>();
            string forceSide = string.Empty;
            string forceUser = string.Empty;
            string command = string.Empty;
            while ((command = Console.ReadLine()) != "Lumpawaroo")
            {
                if (command.Contains(" | "))
                {
                    forceSide = command.Split(" | ")[0];
                    forceUser = command.Split(" | ")[1];
                    if (!usersAndSides.ContainsKey(forceUser))
                    {
                        usersAndSides.Add(forceUser, forceSide);
                    }
                }
                else if (command.Contains(" -> "))
                {
                    forceSide = command.Split(" -> ")[1];
                    forceUser = command.Split(" -> ")[0];
                    if (!usersAndSides.ContainsKey(forceUser))
                    {
                        usersAndSides.Add(forceUser, forceSide);
                        Console.WriteLine($"{forceUser} joins the {forceSide} side!");
                    }
                    else if (usersAndSides[forceUser] != forceSide)
                    {
                        usersAndSides[forceUser] = forceSide;
                        Console.WriteLine($"{forceUser} joins the {forceSide} side!");
                    }
                }
            }
            foreach (var orderedSide in usersAndSides.GroupBy(x => x.Value).OrderByDescending(x => x.Count()).ThenBy(x => x.Key))
            {
                Console.WriteLine($"Side: {orderedSide.Key}, Members: {orderedSide.Count()}");
                foreach (var orderedUser in orderedSide.OrderBy(x => x.Key))
                {
                    Console.WriteLine($"! {orderedUser.Key}");
                }
            }
        }
    }
}
