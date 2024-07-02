using NUnit.Framework;

namespace TestApp.UnitTests;

public class FibonacciTests
{
    [Test]
    public void Test_CalculateFibonacci_ZeroInput()
    {
       //Arrange
        int n = 0;
        int expected = 0;

        //Act
        int actual = Fibonacci.CalculateFibonacci(n);

       //Assert
       Assert.AreEqual(expected, actual);

    }

    [Test]
    public void Test_CalculateFibonacci_PositiveInput()
    {
        //Arrange
        int n = 8;
        int expected = 21;

        //Act
        int actual = Fibonacci.CalculateFibonacci(n);

        //Assert
        Assert.AreEqual((int)expected, actual);

    }
}