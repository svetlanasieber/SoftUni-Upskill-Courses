//(first base + second base) / 2 * height
//A = (a + b) × h / 2

int firstBase = int.Parse(Console.ReadLine());
int secondBase = int.Parse(Console.ReadLine());
int heightOfTrapezoid = int.Parse(Console.ReadLine());

int area = (firstBase + secondBase) * heightOfTrapezoid / 2;
Console.WriteLine(area);
