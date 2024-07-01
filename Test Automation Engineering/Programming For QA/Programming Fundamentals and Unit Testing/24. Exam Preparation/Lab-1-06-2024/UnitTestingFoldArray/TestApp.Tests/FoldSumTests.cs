using NUnit.Framework;

namespace TestApp.Tests;

public class FoldSumTests
{
    [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, "5 5 13 13")]
    [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, "7 7 7 19 19 19")]
    [TestCase(new int[] { 1, 1, 1, 1,  }, "2 2")]
    [TestCase(new int[] { 1, -2, 3, -4, 5, -6, 7, -8 }, "1 -3 -3 1")]
    [TestCase(new int[] { -1, -2, -3, -4 }, "-3 -7")]
    public void Test_FoldArray_ReturnsCorrectString(int[] arr, string expected)
    {
        //Arrange

        //Act
        string actual = FoldSum.FoldArray(arr);

        //Assert
        Assert.That(actual, Is.EqualTo(expected));
    }
}
