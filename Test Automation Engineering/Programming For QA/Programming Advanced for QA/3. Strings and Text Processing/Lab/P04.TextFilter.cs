using System;
using System.Collections.Generic;
using System.Linq;

namespace P04.TextFilter
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] bannedWords = Console.ReadLine()
                .Split(", ");

            string text = Console.ReadLine();

            while (true)
            {
                for (int i = 0; i < bannedWords.Length; i++)
                {
                    while (text.Contains(bannedWords[i]))
                    {
                        string word = new string('*', bannedWords[i].Length);
                        text = text.Replace(bannedWords[i], word);
                    }
                }
				
                Console.WriteLine(text);
                break;
            }
        }
    }
}
