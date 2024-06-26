//one package dog food costs 2.50 leva
//one package cat food costs 4.00 leva

int countDogFood = int.Parse(Console.ReadLine());
int countCatFood = int.Parse(Console.ReadLine());

double dogFoodPrice = 2.50;
double catFoodPrice = 4.00;

double calculateExpenses = countDogFood * dogFoodPrice + countCatFood * catFoodPrice;
Console.WriteLine($"{calculateExpenses:F2} lv.");
