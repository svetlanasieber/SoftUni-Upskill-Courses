using System;
using System.Collections.Generic;

namespace SongsQueue
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Queue<string> queue = new Queue<string>(Console.ReadLine().Split(", "));
            string command = Console.ReadLine();
            while (queue.Count != 0)
            {
                if (command == "Play")
                {
                    queue.Dequeue();
                }
                else if(command == "Show")
                {
                    Console.WriteLine(string.Join(", ", queue));
                }
                else if (command.StartsWith("Add"))
                {
                    string song = command.Substring(4);
                    if (queue.Contains(song))
                    {
                        Console.WriteLine($"{song} is already contained!");
                    }
                    else
                    {
                        queue.Enqueue(song);
                    }
                }
                command = Console.ReadLine();
            }
            Console.WriteLine("No more songs!");
        }
    }
}
