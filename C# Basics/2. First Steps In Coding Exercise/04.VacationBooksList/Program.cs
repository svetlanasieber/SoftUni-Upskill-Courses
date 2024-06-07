int pages = int.Parse(Console.ReadLine());
int pagesPerHours = int.Parse(Console.ReadLine());
int days = int.Parse(Console.ReadLine());

int time = pages / pagesPerHours;

int hoursPerDay = time / days;

Console.WriteLine(hoursPerDay);
