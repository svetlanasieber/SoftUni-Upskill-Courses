namespace P04.PersonInfo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            string country = Console.ReadLine();
            string town = Console.ReadLine();

            Console.WriteLine($"{firstName} {lastName} from {country} - {town}!");
        }
    }
}
