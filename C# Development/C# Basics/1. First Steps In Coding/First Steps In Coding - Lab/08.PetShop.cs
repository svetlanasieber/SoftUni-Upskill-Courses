int dogFood = int.Parse(Console.ReadLine());
int catFood = int.Parse(Console.ReadLine());

double dogFoodPrice = 2.5;
double catFoodPrice = 4.0;

double neededExpenses = dogFood * dogFoodPrice + catFood * catFoodPrice;

Console.WriteLine($"{neededExpenses} lv.");
