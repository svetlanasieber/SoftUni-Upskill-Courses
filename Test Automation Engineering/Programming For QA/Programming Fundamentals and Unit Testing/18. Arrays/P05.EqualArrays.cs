int[] firstArray = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

int[] secondArray = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();


for (int index = 0;  index <= firstArray.Length - 1; index++)
{
    if (firstArray[index] != secondArray[index])
    {
        Console.WriteLine("Arrays are not identical.");
        return; 
    }
}

Console.WriteLine("Arrays are identical.");
