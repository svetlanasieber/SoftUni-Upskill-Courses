char startLetter = char.Parse(Console.ReadLine()); 
char endLetter = char.Parse(Console.ReadLine()); 
char excludedLetter = char.Parse(Console.ReadLine()); 



int count = 0; 


for (char letter1 = startLetter; letter1 <= endLetter; letter1++)
{
	for (char letter2 = startLetter; letter2 <= endLetter; letter2++)
	{
		for (char letter3 = startLetter; letter3 <= endLetter; letter3++)
		{
         
            if (letter1 != excludedLetter && letter2 != excludedLetter && letter3 != excludedLetter)
            {
            
                Console.Write($"{letter1}{letter2}{letter3} ");
                count++;
            }
        }
    }
}

Console.WriteLine();
Console.WriteLine(count);
