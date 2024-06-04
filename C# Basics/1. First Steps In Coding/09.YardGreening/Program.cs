double area = double.Parse(Console.ReadLine());

double neededPrice = area * 7.61;
double discount = neededPrice * 0.18;
double finalPrice = neededPrice - discount;

Console.WriteLine($"The final price is: {finalPrice} lv.");
Console.WriteLine($"The discount is: {discount} lv.");

