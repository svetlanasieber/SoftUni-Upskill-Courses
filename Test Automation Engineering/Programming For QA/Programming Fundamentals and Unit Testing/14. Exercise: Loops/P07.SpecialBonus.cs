int stopNumber = int.Parse(Console.ReadLine()); 
int prevNumber = 0; 

while (true)
{
    int number = int.Parse(Console.ReadLine()); 
    if (number == stopNumber)
    {
     
        Console.WriteLine(prevNumber * 1.2);
        break;
    }

    prevNumber = number;
}
