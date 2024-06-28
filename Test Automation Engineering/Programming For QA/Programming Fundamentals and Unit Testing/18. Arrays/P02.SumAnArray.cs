int[] numbers = Console.ReadLine()
                .Split(" ") 
                .Select(int.Parse) 
                .ToArray();

int sum = 0; 
for (int index = 0; index <= numbers.Length - 1; index++)
{
    sum += numbers[index];
}

Console.WriteLine(sum);
