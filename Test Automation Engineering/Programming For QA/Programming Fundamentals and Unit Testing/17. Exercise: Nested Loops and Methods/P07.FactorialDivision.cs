int firstNumber = int.Parse(Console.ReadLine());
int secondNumber = int.Parse(Console.ReadLine());

int factFirstNumber = CalculateFactorial(firstNumber);
int factSecondNumber = CalculateFactorial(secondNumber);

Console.WriteLine(factFirstNumber / factSecondNumber);

static int CalculateFactorial(int number)
{
	
	int fact = 1; 
	for (int i = 1; i <= number; i++)
	{
		fact = fact * i;
	}

    return fact;
}
