using System;
using System.Collections.Generic;
using System.Linq;

namespace ThePartyReservation_ilterModule
{
    internal class ThePartyReservation_ilterModule
    {
        static void Main(string[] args)
        {
            List<Person> peolpe =  new List<Person>();
            List<string> input = Console.ReadLine().Split().ToList();
            foreach (var item in input)
            {
                Person current = new Person(item, true);
                peolpe.Add(current);
            }
            string command = string.Empty;
            while ((command = Console.ReadLine()) != "Print")
            {
                Predicate<string> predicate = GetPredicate(command);
                if (command.StartsWith("Add"))
                {
                    for (int i = 0; i < peolpe.Count; i++)
                    {
                        Person person = peolpe[i];
                        string currentName = person.Name;
                        if (predicate(currentName))
                        {
                            person.IsFiltered = false;
                        }
                    }
                }
                else if (command.StartsWith("Remove"))
                {
                    for (int i = 0; i < peolpe.Count; i++)
                    {
                        Person person = peolpe[i];
                        if (predicate(person.Name))
                        {
                            person.IsFiltered = true;
                        }
                    }
                }
            }
            if (peolpe.Any())
            {
                Console.WriteLine(string.Join(" ", peolpe.Where(x => x.IsFiltered == true).Select(y => y.Name)));
            }
        }

        private static Predicate<string> GetPredicate(string command)
        {
            Predicate<string> predicate = null;
            string token2 = command.Split(";")[1];
            string token3 = command.Split(";")[2];
            if (token2 == "Starts with")
            {
                predicate = x => x.StartsWith(token3);
            }
            else if (token2 == "Ends with")
            {
                predicate = x => x.EndsWith(token3);
            }
            else if (token2 == "Contains")
            {
                predicate = x => x.Contains(token3);
            }
            else if (token2 == "Length")
            {
                predicate = x => x.Length == int.Parse(token3);
            }
            return predicate;
        }
    }
    class Person
    {
        private string name;
        private bool isFiltered;
        public string Name { get; set; }
        public bool IsFiltered { get; set; }
        public Person(string name, bool isFiltered)
        {
            Name = name;
            IsFiltered = isFiltered;
        }
    }
}
