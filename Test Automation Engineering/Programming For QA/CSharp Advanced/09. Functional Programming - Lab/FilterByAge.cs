using System;
using System.Collections.Generic;
using System.Linq;

namespace FilterByAge
{
    internal class FilterByAge
    {
        static void Main(string[] args)
        {
            List<Person> people = ReadPeople();
            string condition = Console.ReadLine();
            int ageThreshold = int.Parse(Console.ReadLine());
            Func<Person, bool> filter = CreatePersoFilter(condition, ageThreshold);
            List<Person> filteredPeople = people.Where(filter).ToList();
            string format = Console.ReadLine();
            Action<Person> CreatingPersonPrinter = PrinterPerson(format);
            PrintPeople(filteredPeople, CreatingPersonPrinter);
        }

        private static void PrintPeople(List<Person> filteredPeople, Action<Person> creatingPersonPrinter)
        {
            foreach (Person person in filteredPeople)
                creatingPersonPrinter(person);
        }

        private static Action<Person> PrinterPerson(string format)
        {
            if (format == "name age")
                return (Person p) => Console.WriteLine($"{p.Name} - {p.Age}");
            if (format == "name")
                return (Person p) => Console.WriteLine($"{p.Name}");
            if (format == "age")
                return (Person p) => Console.WriteLine($"{p.Age}");
            throw new ArgumentException($"Invalid format: { format }");

        }

        private static Func<Person, bool> CreatePersoFilter(string condition, int ageThreshold)
        {

            if (condition == "older")
                return x => x.Age >= ageThreshold;
            else if (condition == "younger")
                return x => x.Age < ageThreshold;

            throw new ArgumentException($"Invalid filter: {condition} {ageThreshold}");
        }

        private static List<Person> ReadPeople()
        {
            int number = int.Parse(Console.ReadLine());
            List<Person> people = new List<Person>();
            for (int i = 0; i < number; i++)
            {
                string[] tokens = Console.ReadLine().Split(", ");
                string name = tokens[0];
                int age = int.Parse(tokens[1]);
                people.Add(new Person(name, age));
            }
            return people;
        }

    }

    class Person
    {
        public Person(string name, int age)
        {
            this.Name = name;
            this.Age = age;
        }

        public string Name { get; set; }
        public int Age { get; set; }
    }
}
