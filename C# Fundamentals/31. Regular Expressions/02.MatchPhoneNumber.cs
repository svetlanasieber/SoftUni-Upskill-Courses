using System.Text.RegularExpressions;

string text = Console.ReadLine();


Regex regexPhoneNumber = new Regex(@"[+]359([ -])2\1[0-9]{3}\1[0-9]{4}");

MatchCollection allValidPhoneNumbers = regexPhoneNumber.Matches(text);

for (int position = 0; position <= allValidPhoneNumbers.Count - 1; position++)
{
    if (position == allValidPhoneNumbers.Count - 1)
    {
       
        Console.Write(allValidPhoneNumbers[position].Value);
    }
    else
    {
        Console.Write(allValidPhoneNumbers[position].Value + ", ");
    }  
}
