using System.Text.RegularExpressions;

string text = Console.ReadLine();
Regex regexDate = new Regex(@"(?<day>[0-9]{2})(?<separator>[\.\-\/])(?<month>[A-Z][a-z]{2})\k<separator>(?<year>[0-9]{4})");
MatchCollection validDates = regexDate.Matches(text);

foreach (Match validDate in validDates)
{
  
    string day = validDate.Groups["day"].Value; //"13"
    string month = validDate.Groups["month"].Value; //"Jul"
    string year = validDate.Groups["year"].Value; //"1928"

    Console.WriteLine($"Day: {day}, Month: {month}, Year: {year}");
}
