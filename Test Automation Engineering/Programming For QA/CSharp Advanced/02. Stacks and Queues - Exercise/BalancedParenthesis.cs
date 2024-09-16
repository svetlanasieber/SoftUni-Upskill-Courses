using System;
using System.Collections.Generic;

namespace BalancedParenthesis
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            Stack<char> stack = new Stack<char>();
            bool isSuccess = false;
            foreach (var item in input)
            {
                if(item == '(' || item == '[' || item == '{')
                {
                    stack.Push(item);
                }
                else
                {
                    if (stack.Count == 0)
                    {
                        isSuccess = true;
                        break;
                    }
                    char openBracket = stack.Pop();
                    if (!( openBracket == '(' && item == ')' || openBracket == '[' && item == ']' || openBracket == '{' && item == '}'))
                    {
                        isSuccess = true;
                    }
                }
            }
            if (!isSuccess)
            {
                Console.WriteLine("YES");
            }
            else
            {
                Console.WriteLine("NO");
            }
        }
    }
}
