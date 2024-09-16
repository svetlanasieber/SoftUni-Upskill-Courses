using System;
using System.Linq;

namespace SquaresInMatrix
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] dimensions = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            string[,] matrix = new string[dimensions[0], dimensions[1]];
            ReadMatrix(matrix);
            int sum = 0;
            for (int row = 0; row < matrix.GetLength(0) - 1; row++)
            {
                for (int col = 0; col < matrix.GetLength(1) - 1; col++)
                {
                    if (matrix[row , col] == matrix[row, col + 1] &&
                        matrix[row, col] == matrix[row + 1, col] &&
                        matrix[row, col] == matrix[row + 1, col + 1])
                        sum++;
                }
            }
            Console.WriteLine(sum);
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

    }
}
