using System;
using System.Linq;

class MagicNumbers
{
    static void Main()
    {
       
        int N = int.Parse(Console.ReadLine());

        int[] primeDigits = { 2, 3, 5, 7 };

        var magicNumbers = new List<int>();

      
        for (int i = 1; i <= N; i++)
        {
          
            if (IsMagicNumber(i, primeDigits))
            {
                magicNumbers.Add(i);
            }
        }

     
        if (magicNumbers.Count > 0)
        {
            Console.WriteLine(string.Join(" ", magicNumbers));
        }
        else
        {
            Console.WriteLine("no");
        }
    }

    static bool IsMagicNumber(int number, int[] primeDigits)
    {
      
        int sumOfDigits = 0;
        int temp = number;

        while (temp > 0)
        {
            int digit = temp % 10;
            if (!primeDigits.Contains(digit))
            {
                return false;
            }

            sumOfDigits += digit;
            temp /= 10;
        }

        return sumOfDigits % 2 == 0;
    }
}
