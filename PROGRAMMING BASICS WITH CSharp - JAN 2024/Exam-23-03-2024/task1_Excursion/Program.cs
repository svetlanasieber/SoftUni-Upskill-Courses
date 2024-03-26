int groupSize = int.Parse(Console.ReadLine());
int nights = int.Parse(Console.ReadLine());
int transportCards = int.Parse(Console.ReadLine());
int museumTickets = int.Parse(Console.ReadLine());

const double NIGHT_COST = 20.0;
const double TRANSPORT_COST = 1.60;
const double MUSEUM_COST = 6.0;

double personTotal = (nights * NIGHT_COST) + (transportCards * TRANSPORT_COST) + (museumTickets * TRANSPORT_COST);

double groupTotal = personTotal * groupSize;
double total = groupTotal + (groupTotal * 0.25);

Console.WriteLine($"{total:F2}");

