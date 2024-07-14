string[] words = Console.ReadLine().Split();
string result = "";
foreach (string word in words)
{
    int repeatTimes = word.Length;
    for (int i = 0; i < repeatTimes; i++)
        result += word;
}
Console.WriteLine(result);


//v2
/*
string[] words = Console.ReadLine().Split(" ");
for (int i = 0; i < words.Length; i++)
{
    for (int j = 0; j < words[i].Length; j++)
    {
        Console.Write(words[i]);
    }
}
*/
