using System;
using System.Text;

namespace P02.RepeatStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] words = Console.ReadLine()
                .Split();

            StringBuilder result = new StringBuilder();

            foreach (var word in words)
            {
                int count = word.Length;
				
                for (int i = 0; i < count; i++)
                {
                    result.Append(word);
                }
            }
			
            Console.WriteLine(result);
        }
    }
}
