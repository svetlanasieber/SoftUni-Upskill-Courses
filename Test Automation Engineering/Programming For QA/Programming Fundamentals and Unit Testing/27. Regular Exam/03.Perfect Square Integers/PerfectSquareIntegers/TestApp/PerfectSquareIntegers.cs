using System.Text;

namespace TestApp;

public class PerfectSquareIntegers
{
    public static string FindPerfectSquares(int start, int end)
    {
        if (start > end)
        {
            return "Start number should be less than end number.";
        }

        StringBuilder result = new StringBuilder();

        for (int num = start; num <= end; num++)
        {
            if (IsPerfectSquare(num))
            {
                result.Append(num + " ");
            }
        }

        return result.ToString().Trim();
    }

    private static bool IsPerfectSquare(int number)
    {
        if (number < 0)
        {
            return false;
        }

        int sqrt = (int)Math.Sqrt(number);
        return sqrt * sqrt == number;
    }
}

