using System;
using System.Linq;

namespace P01.ReverseStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                string text = Console.ReadLine();

                if (text == "end")
                {
                    break;
                }
				
                string reversedText = null;

                for(int i = text.Length-1; i >= 0;i--)
                {
                    reversedText+=text[i];
                }

                Console.WriteLine($"{text} = {reversedText}");
            }
        }
    }
}
