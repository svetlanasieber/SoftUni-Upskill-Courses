Greeting(); //1.Greeting("Dimitrichko");

Console.WriteLine("Greeting again:"); 

Greeting(); //1. Greeting("Goshko")

for (int i = 0; i < 100; i++)
{
    Greeting(); //1. Greeting(""Viktor");
}

void Greeting() 
{
    Console.WriteLine("Hello");
    Console.WriteLine("My name is Viktor"); //1. Console.WriteLine($"My name is {name}");
    Console.WriteLine("And I study in SoftUni");
}
