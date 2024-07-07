using NUnit.Framework;

namespace TestApp.Tests
{
    public class PerfectSquareIntegersTests
    {
        [Test]
        public void Test_FindPerfectSquares_StartNumberGreaterThanEndNumber_ReturnsErrorMessage()
        {
            // Arrange
            int start = 10;
            int end = 1;

            // Act
            string result = PerfectSquareIntegers.FindPerfectSquares(start, end);

            //Assert
            Assert.AreEqual("Start number should be less than end number.", result);
        }

        [Test]
        public void Test_FindPerfectSquares_GetSameSquareIntegerForStartAndEnd_ReturnsSameSquareInteger()
        {
            // Arrange
            int start = 1;
            int end = 1;

            // Act
            string result = PerfectSquareIntegers.FindPerfectSquares(start, end);

            // Assert
            Assert.AreEqual("1", result);

        }

        [Test]
        public void Test_FindPerfectSquares_GetZeroAsSingleInteger_ReturnsZero()
        {
            // Arrange
            int start = 0;
            int end = 0;

            // Act
            string result = PerfectSquareIntegers.FindPerfectSquares(start, end);

            // Assert
            Assert.AreEqual("0", result);

        }

        [Test]
        public void Test_FindPerfectSquares_RangeIncludesMultiplePerfectSquares_RetursOnlySquareIntegers()
        {
            // Arrange
            int start = 1;
            int end = 50;

            // Act
            string result = PerfectSquareIntegers.FindPerfectSquares(start, end);

            // Assert
            Assert.AreEqual("1 4 9 16 25 36 49", result);

        }

        [Test]
        public void Test_FindPerfectSquares_NoPerfectSquaresInRange_ReturnsEmptyString()
        {
            // Arrange
            int start = 2;
            int end = 3;

            // Act
            string result = PerfectSquareIntegers.FindPerfectSquares(start, end);

            // Assert
            Assert.AreEqual(string.Empty, result);
        }
    }
}

