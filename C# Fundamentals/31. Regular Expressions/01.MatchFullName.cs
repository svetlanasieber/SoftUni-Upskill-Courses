using System;
using System.Text.RegularExpressions;
using System.Linq;

class Program
{
    static void Main()
    {
        
        string input = Console.ReadLine();

        string pattern = @"\b[A-Z][a-z]+ [A-Z][a-z]+\b";

        MatchCollection matches = Regex.Matches(input, pattern);

        var matchedNames = matches.Cast<Match>().Select(m => m.Value);
        Console.WriteLine(string.Join(" ", matchedNames));
    }
}
