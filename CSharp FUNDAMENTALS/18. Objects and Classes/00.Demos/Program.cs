namespace _00.Demos;

class Program
{
    static void Main(string[] args)
    {
        Dog puppy = new Dog
        {
            Name = "Sparky",
            Breed = "Labrador",
            Age = 3
        };
    }
}

public class Dog
{
    public string Name { get; set; }
    public string Breed { get; set; }
    public int Age { get; set; }
    
    public void Bark()
    {
        Console.WriteLine("Woof woof!");
    }
    
}
