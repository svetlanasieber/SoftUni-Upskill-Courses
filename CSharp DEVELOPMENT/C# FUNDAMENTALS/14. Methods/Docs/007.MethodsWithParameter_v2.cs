
PrintName("Gosho", 10); //1. string name, 2. int times
PrintName("Niki", 2);

string name = Console.ReadLine();

PrintName(name, int.Parse(Console.ReadLine()));

void PrintName(string name, int times)
{
    for (int i = 0; i < times; i++){
        
        Console.WriteLine($"Hello, my name is {name}");
    }
}



