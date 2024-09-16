using System;
using System.Linq;

namespace MaximalSum
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] matrixSize = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
            int[,] matrix = new int[matrixSize[0], matrixSize[1]];
            ReadMatrix(matrix);
            int maxSumRowIndex = 0;
            int maxSumColIndex = 0;
            int maxSum = int.MinValue;
            for (int row = 0; row < matrix.GetLength(0) - 2; row++)
            {
                for (int col = 0; col < matrix.GetLength(1) - 2; col++)
                {
                    int currentSum = 0;
                    for (int rowCurrent = row; rowCurrent < row + 3; rowCurrent++)
                    {
                        for (int colCurrent = col; colCurrent < col + 3; colCurrent++)
                        {
                            currentSum += matrix[rowCurrent, colCurrent];
                        }
                    }
                    if (maxSum < currentSum)
                    {
                        maxSum = currentSum;
                        maxSumRowIndex = row;
                        maxSumColIndex = col;
                    }
                }
            }
            Console.WriteLine($"Sum = {maxSum}");
            for (int rowCurrent = maxSumRowIndex; rowCurrent < maxSumRowIndex + 3; rowCurrent++)
            {
                for (int colCurrent = maxSumColIndex; colCurrent < maxSumColIndex + 3; colCurrent++)
                {
                    Console.Write($"{matrix[rowCurrent, colCurrent]} ");
                }
                Console.WriteLine();
            }
        }
        static void ReadMatrix(int[,] matrix)
        {
            const string separator = " ";

            for (int row = 0; row < matrix.GetLength(0); row++)
            {
                int[] inputData = Console.ReadLine().Split(separator, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

                for (int column = 0; column < matrix.GetLength(1); column++)
                {
                    matrix[row, column] = inputData[column];
                }
            }
        }
    }
}
