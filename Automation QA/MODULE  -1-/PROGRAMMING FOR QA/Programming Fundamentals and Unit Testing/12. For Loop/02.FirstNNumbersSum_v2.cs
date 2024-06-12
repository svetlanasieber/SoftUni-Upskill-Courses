int number = int.Parse(Console.ReadLine());

int sum = 0;

for (int i = 1;  i <= number; i++)
{
    sum = sum + i; //sum += i;
}
for (int i = 1; i < number; i++)
{
    Console.Write($"{i}+");
}
Console.WriteLine($"{number}={sum}");
