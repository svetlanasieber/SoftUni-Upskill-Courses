//-> https://judge.softuni.org/Contests/Compete/Index/4404#1

//which sums the numbers 1…n:

//1. Reads an integer number n from the console
int number = int.Parse(Console.ReadLine());

int sum = 0;

//2. Sums all numbers from 1 to n
for (int i = 1; i <= number; i++)
{
    sum = sum + i; //sum += i;
}

//3. Prints the numbers and the sum on the console as shown below
// 1+; 2+, 3+, 4+, 5+ = 15
for (int i = 1; i < number; i++)
{
    Console.Write($"{i}+");
}
Console.Write(number);
Console.WriteLine($"={sum}");


