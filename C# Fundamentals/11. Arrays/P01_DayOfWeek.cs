//int[] array = { 1, 2, 3, 4, 5, 100 };

//for (int i = 0; i < array.Length; i++)
//{
//    Console.WriteLine(array[i] + " ");
//}

string[] days =
{
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
};

int currentDay = int.Parse(Console.ReadLine());

if (currentDay >= 1 && currentDay <= 7) 
{
    Console.WriteLine(days[currentDay -1]);
}
else
{
    Console.WriteLine("Invalid day!");

}
