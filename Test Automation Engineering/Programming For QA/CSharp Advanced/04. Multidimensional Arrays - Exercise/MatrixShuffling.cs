using System;
using System.Linq;

namespace MatrixShuffling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] matrixSize = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
            string[,] matrix = new string[matrixSize[0], matrixSize[1]];
            ReadMatrix(matrix);
            string command = string.Empty;
            while ((command = Console.ReadLine()) != "END")
            {
                if (!CheckValidaty(command, matrix.GetLength(0), matrix.GetLength(1)))
                {
                    Console.WriteLine("Invalid input!");
                    continue;
                }
                string[] cmdArg = command.Split(" ", StringSplitOptions.RemoveEmptyEntries).ToArray();
                int row1 = int.Parse(cmdArg[1]);
                int col1 = int.Parse(cmdArg[2]);
                int row2 = int.Parse(cmdArg[3]);
                int col2 = int.Parse(cmdArg[4]);
                string temp = matrix[row1, col1];
                matrix[row1, col1] = matrix[row2, col2];
                matrix[row2, col2] = temp;
                PrintMatrix(matrix);
            }
        }
        private static void ReadMatrix(string[,] matrix)
        {
            const string separator = " ";

            for (int row = 0; row < matrix.GetLength(0); row++)
            {
                string[] inputData = Console.ReadLine().Split(separator).ToArray();

                for (int column = 0; column < matrix.GetLength(1); column++)
                {
                    matrix[row, column] = inputData[column];
                }
            }
        }

        static bool CheckValidaty(string command, int row, int col)
        {
            bool isValid = true;
            if (!command.StartsWith("swap "))
            {
                return false;
            }
            else
            {
                string[] cmdArg = command.Split(" ", StringSplitOptions.RemoveEmptyEntries).ToArray();
                if (cmdArg.Length != 5)
                    return false;

                int row1 = int.Parse(cmdArg[1]);
                int col1 = int.Parse(cmdArg[2]);
                int row2 = int.Parse(cmdArg[3]);
                int col2 = int.Parse(cmdArg[4]);

                if (!(row1 >= 0 && row1 < row &&
                    row2 >= 0 && row2 < row &&
                    col1 >= 0 && col1 < col &&
                    col2 >= 0 && col2 < col))
                    isValid = false;

            }
            return isValid;
        }
        private static void PrintMatrix(string[,] matrix)
        {
            const string separator = " ";
            for (int row = 0; row < matrix.GetLength(0); row++)
            {
                for (int col = 0; col < matrix.GetLength(1); col++)
                {
                    if (col < matrix.GetLength(1) - 1)
                        Console.Write($"{matrix[row, col]}{separator}");
                    else
                    Console.WriteLine($"{matrix[row, col]}");
                }
            }
        }
    }
}
