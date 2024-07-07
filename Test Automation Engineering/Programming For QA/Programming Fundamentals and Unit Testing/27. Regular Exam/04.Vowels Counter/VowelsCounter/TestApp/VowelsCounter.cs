using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestApp;

public class VowelsCounter
{
    public static int CountTotalVowels(List<string> words)
    {
        int totalVowels = 0;

        string allChars = string.Join(string.Empty, words);

        foreach (char singleChar in allChars.ToLower())
        {
            if ("aeiou".Contains(singleChar))
            {
                totalVowels += 1;
            }
        }

        return totalVowels;
    }
}


