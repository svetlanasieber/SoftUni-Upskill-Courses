using System;
using System.Collections.Generic;
using System.Linq;

namespace ActionPrint
{
    internal class ActionPrint
    {
        static void Main(string[] args)
        {
            List<string> names = Console.ReadLine().Split().ToList();
            Action<string> printNames =  name => Console.WriteLine(name);
            names.ForEach(printNames);
        }
    }
}
