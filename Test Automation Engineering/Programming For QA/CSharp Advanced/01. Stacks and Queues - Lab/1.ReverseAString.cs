string input = Console.ReadLine();
Stack<char> reversedString = new Stack<char>();

for (int i = 0; i < input.Length; i++)
{
char letter = input[i];
reversedString.Push(letter);
    
}
while (reversedString.Count > 0)
{
    Console.Write(reversedString.Pop());
}
