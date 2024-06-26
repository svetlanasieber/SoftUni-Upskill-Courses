//1 Fahrenheit = 1 Celsius * 1.8  + 32

double temperatureInCelsius = double.Parse(Console.ReadLine());

double temperatureInFarenheit = (temperatureInCelsius * 1.8) + 32;
Console.WriteLine($"{temperatureInFarenheit:F2}");
