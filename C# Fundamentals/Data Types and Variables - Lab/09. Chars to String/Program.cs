﻿using System;

namespace CharsToString
{
    class Program
    {
        static void Main(string[] args)
        {
            const int endLoop = 3;
            char[] letters = new char[endLoop];
            string output = string.Empty;

            for (int i = 0; i < endLoop; i++)
            {
                letters[i] = char.Parse(Console.ReadLine());
            }

            for (int j = 0; j < endLoop; j++)
            {
                output += letters[j];
            }

            Console.WriteLine(output);
        }
    }
}
