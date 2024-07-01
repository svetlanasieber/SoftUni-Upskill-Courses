int[] numbers = Console.ReadLine() // len --> 1 2 3 4 5 6
    .Split(" ")
    .Select(int.Parse)
    .ToArray();

// 0 1 2 3 4 5 6 --> indexes
// 1 2 3 4 5 6 --> array.len /2 -->

int middleIndex = numbers.Length / 2;
int firstNumber = numbers[middleIndex];
int secondNumber = numbers[middleIndex - 1];

int sum = firstNumber + secondNumber;
double result = sum / 2.0;
Console.WriteLine($"{result:F2}");
