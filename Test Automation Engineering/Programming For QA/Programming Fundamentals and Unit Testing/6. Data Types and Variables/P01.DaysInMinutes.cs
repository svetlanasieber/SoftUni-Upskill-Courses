//"Minutes = {calculated minutes}"

int days = int.Parse(Console.ReadLine());

//1 day = 24 hours * 60 minutes

int calculateMinutes = days * 24 * 60;
Console.WriteLine($"Minutes = {calculateMinutes}");
