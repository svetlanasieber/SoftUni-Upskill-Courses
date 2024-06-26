double radius = double.Parse(Console.ReadLine());

//•	Calculate the area and the perimeter of a circle using formulas: 
//1. area = radius * radius * pi
//2.	perimeter = 2 * pi * radius

double area = radius * radius * Math.PI;
double perimeter = 2 * Math.PI * radius;
Console.WriteLine($"Area = {area:F2}");
Console.WriteLine($"Perimeter = {perimeter:F2}");
