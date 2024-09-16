namespace SimpleTextEditor
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Stack<string> state = new Stack<string>();

            int n = int.Parse(Console.ReadLine());

            string text = string.Empty; 
            for (int i = 0; i < n; i++)
            {
                string[] commandInfo = Console.ReadLine().Split();

                if (commandInfo[0] == "1") 
                {
                    state.Push(text);
                    text += commandInfo[1];
                }
                else if (commandInfo[0] == "2") 
                {
                    state.Push(text);
                    int valueToErase = int.Parse(commandInfo[1]);
                    text = text.Substring(0, text.Length - valueToErase);
                }
                else if (commandInfo[0] == "3")
                {
                    int indexToPrint = int.Parse(commandInfo[1]);
                    Console.WriteLine(text[indexToPrint - 1]);
                }
                else if (commandInfo[0] == "4")
                {
                    text = state.Pop();
                }
            }
        }
    }
}
