List<int> numbers = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

string command = Console.ReadLine();

while (command != "end")
{
    if (command.StartsWith("Contains"))
    {
        
        int numberContained = int.Parse(command.Split(" ")[1]); 
        if (numbers.Contains(numberContained))
        {
            Console.WriteLine("Yes");
        }
        else
        {
            Console.WriteLine("No such number");
        }
    }
    else if (command == "PrintEven")
    {
        
        foreach(int number in numbers)
        {
            if (number % 2 == 0)
            {
                Console.Write(number + " ");
            }
        }
        Console.WriteLine(); 
    }
    else if (command == "PrintOdd")
    {
        
        foreach (int number in numbers)
        {
            if (number % 2 != 0)
            {
                Console.Write(number + " ");
            }
        }
        Console.WriteLine(); 
    }
    else if (command == "GetSum")
    {
       
        Console.WriteLine(numbers.Sum());
    }
    else if (command.StartsWith("Filter"))
    {
        
        string condition = command.Split(" ")[1]; 
        int number = int.Parse(command.Split(" ")[2]); 
       switch(condition)
        {
            case "<":
                numbers.RemoveAll(numberInList => numberInList >= number);
                break;
            case ">":
                numbers.RemoveAll(numberInList => numberInList <= number);
                break;
            case "<=":
                numbers.RemoveAll(numberInList => numberInList > number);
                break;
            case ">=":
                numbers.RemoveAll(numberInList => numberInList < number);
                break;
        }   
    }

    command = Console.ReadLine();

}

Console.WriteLine(string.Join(" ", numbers));
