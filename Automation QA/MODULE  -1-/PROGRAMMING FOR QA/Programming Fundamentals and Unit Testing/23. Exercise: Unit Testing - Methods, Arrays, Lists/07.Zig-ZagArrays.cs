int n = int.Parse(Console.ReadLine());

int[] firstArray = new int[n];
int[] secondArray = new int[n];

for (int i = 0; i < n; i++)
{
    string[] input = Console.ReadLine().Split();
    int num1 = int.Parse(input[0]);
    int num2 = int.Parse(input[1]);

    if (i % 2 == 0)
    {
        firstArray[i] = num1;
        secondArray[i] = num2;
    }
    else
    {
        firstArray[i] = num2;
        secondArray[i] = num1;
    }
}

Console.WriteLine(string.Join(" ", firstArray));
Console.WriteLine(string.Join(" ", secondArray));
