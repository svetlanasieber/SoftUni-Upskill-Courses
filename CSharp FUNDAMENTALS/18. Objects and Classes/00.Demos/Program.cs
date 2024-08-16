namespace _00.Demos;

class Program
{
    static void Main(string[] args)
    {
        //variant 1
        Dog puppy = new Dog
        {
            Name = "Sparky",
            Breed = "Labrador",
            Age = 3
        };
        
        //variant 2
        Dog friend = new Dog();
        friend.Name = "Buddy";
        friend.Breed = "Golden Retriever";
        friend.Age = 5;
    }
}

