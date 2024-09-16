using System;
using System.Linq;

namespace JaggedArrayManipulator
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int rows = int.Parse(Console.ReadLine());
            int[][] jaggedMatrix = new int[rows][];
            for (int row = 0; row < rows; row++)
                jaggedMatrix[row] = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

            for (int row = 0; row < rows - 1; row++)
            {
                if (jaggedMatrix[row].Length == jaggedMatrix[row + 1].Length)
                {
                    jaggedMatrix[row] = jaggedMatrix[row].Select(element => element * 2).ToArray();
                    jaggedMatrix[row + 1] = jaggedMatrix[row + 1].Select(element => element * 2).ToArray();
                }
                else
                {
                    jaggedMatrix[row] = jaggedMatrix[row].Select(element => element / 2).ToArray();
                    jaggedMatrix[row + 1] = jaggedMatrix[row + 1].Select(element => element / 2).ToArray();
                }
            }

            string command = string.Empty;
            while ((command = Console.ReadLine()) != "End")
            {
                int row = int.Parse(command.Split()[1]);
                int col = int.Parse(command.Split()[2]);
                int value = int.Parse(command.Split()[3]);

                if (command.StartsWith("Add"))
                {
                    if (row >= 0 && row < rows && col >= 0 && col < jaggedMatrix[row].Length)
                        jaggedMatrix[row][col] += value;
                }
                else if (command.StartsWith("Subtract"))
                {
                    if (row >= 0 && row < rows && col >= 0 && col < jaggedMatrix[row].Length)
                        jaggedMatrix[row][col] -= value;
                }
            }

            foreach (int[] item in jaggedMatrix)
            {
                Console.WriteLine(string.Join(" ", item));
            }
        }
    }
}
