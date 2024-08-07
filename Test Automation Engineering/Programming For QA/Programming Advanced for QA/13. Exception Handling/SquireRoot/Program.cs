int number = int.Parse(Console.ReadLine());

try
{
  
    if (number < 0)
    {
     
        throw new Exception("Invalid number.");
    }
    
    double result = Math.Sqrt(number);
    Console.WriteLine(result);
}
catch (Exception e)
{
    Console.WriteLine(e.Message);
}
finally
{
    Console.WriteLine("Goodbye.");
}


