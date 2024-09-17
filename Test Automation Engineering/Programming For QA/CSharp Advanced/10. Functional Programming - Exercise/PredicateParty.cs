using System;
using System.Collections.Generic;
using System.Linq;

namespace PredicateParty
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> peolpe = Console.ReadLine().Split().ToList();
            string command = string.Empty;
            while ((command = Console.ReadLine()) != "Party!")
            {
                Predicate<string> predicate = GetPredicate(command);
                if (command.StartsWith("Double"))
                {
                    for (int i = 0; i < peolpe.Count; i++)
                    {
                        if (predicate(peolpe[i]))
                        {
                            peolpe.Insert(i + 1, peolpe[i]);
                            i++;
                        }
                    }
                }
                else if (command.StartsWith("Remove"))
                {
                    peolpe.RemoveAll(predicate);
                }
            }
            if (peolpe.Count == 0)
            {
                Console.WriteLine("Nobody is going to the party!");
            }
            else
            {
                Console.Write(string.Join(", ", peolpe));
                Console.WriteLine(" are going to the party!");
            }
        }

        private static Predicate<string> GetPredicate(string command)
        {
            Predicate<string> predicate = null;
            string token2 = command.Split()[1];
            string token3 = command.Split()[2];
            if (token2 == "StartsWith")
            {
                predicate = x => x.StartsWith(token3);
            }
            else if (token2 == "EndsWith")
            {
                predicate = x => x.EndsWith(token3);
            }
            else if (token2 == "Length")
            {
                predicate = x => x.Length == int.Parse(token3);
            }
            return predicate;
        }
    }
}
