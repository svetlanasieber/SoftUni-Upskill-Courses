string[] words = Console.ReadLine().Split();
string result = "";
foreach (string word in words)
{
    int repeatTimes = word.Length;
    for (int i = 0; i < repeatTimes; i++)
        result += word;
}
Console.WriteLine(result);
