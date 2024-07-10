using System;

namespace P05.DigitsLettersandOther
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            string digits = null;
            string letters = null;
            string symbols = null;

            for (int i = 0; i < text.Length; i++)
            {
                char ch = text[i];
				
                if (Char.IsDigit(ch))
                {
                    digits += ch;
                }
				
                else if (Char.IsLetter(ch))
                {
                    letters += ch;
                }
				
                else
                {
                    symbols += ch;
                }
            }
			
            Console.WriteLine(digits);
            Console.WriteLine(letters);
            Console.WriteLine(symbols);
        }
    }
}
