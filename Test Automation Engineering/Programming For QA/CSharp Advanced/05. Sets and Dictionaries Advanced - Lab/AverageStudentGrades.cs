using System;
using System.Collections.Generic;
using System.Linq;

namespace AverageStudentGrades
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            var students =  new Dictionary<string, List<decimal>>();
            for (int i = 0; i < number; i++)
            {
                string input = Console.ReadLine();
                string name = input.Split(" ", StringSplitOptions.RemoveEmptyEntries)[0];
                decimal grade = decimal.Parse(input.Split(" ", StringSplitOptions.RemoveEmptyEntries)[1]);
                if (!students.ContainsKey(name))
                {
                    students.Add(name, new List<decimal>());
                }
                students[name].Add(grade);
            }
            foreach (var item in students)
            {
                Console.WriteLine($"{item.Key} -> {string.Join(" ", item.Value.Select(y => y.ToString("f2")))} (avg: {item.Value.Select(x => x).Average(x => x):f2})");
            }
        }
    }
}
