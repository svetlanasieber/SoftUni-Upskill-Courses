int n = int.Parse(Console.ReadLine());


for (int firstNumber = 2; firstNumber <= n; firstNumber += 2)
{
    
    for (int secondNumber = 1; secondNumber <= n; secondNumber += 2)
    {
        
        Console.Write($"{firstNumber}{secondNumber}{firstNumber * secondNumber} ");
    }
}
