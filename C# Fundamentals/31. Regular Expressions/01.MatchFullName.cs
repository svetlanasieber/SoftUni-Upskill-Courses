using System.Text.RegularExpressions;

string text = Console.ReadLine();

Regex regexFullName = new Regex(@"\b[A-Z][a-z]+ [A-Z][a-z]+\b");

MatchCollection allFullNames = regexFullName.Matches(text);

foreach (Match fullName in allFullNames)
{
    Console.Write(fullName.Value + " ");
}
