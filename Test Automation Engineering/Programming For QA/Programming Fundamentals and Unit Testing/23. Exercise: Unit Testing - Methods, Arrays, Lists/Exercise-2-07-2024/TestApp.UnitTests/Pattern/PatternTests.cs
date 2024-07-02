using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class PatternTests
{
    [Test]
    public void Test_SortInPattern_SortsIntArrayInPattern_SortsCorrectly()
    {
        // Arrange
        int[] inputArray = new int[] { 1, 2, 1, 2, 15, 7, 12, 15 };
        int[] expected = new int[] { 1, 15, 2, 12, 7 };

        // Act
        int[] actual = Pattern.SortInPattern(inputArray);

        // Assert
        Assert.AreEqual(expected, actual);


    }

    [Test]
    public void Test_SortInPattern_EmptyArray_ReturnsEmptyArray()
    {
        // Arrange
        int[] inputArray = Array.Empty<int>();

        // Act
        int[] actual = Pattern.SortInPattern(inputArray);

        // Assert
        Assert.That(actual, Is.Empty);
    }

    [Test]
    public void Test_SortInPattern_SingleElementArray_ReturnsSameArray()
    {
        // Arrange
        int[] inputArray = new int[] { 7 };
        int[] expected = new int[] { 7 };

        // Act
        int[] actual = Pattern.SortInPattern(inputArray);

        // Assert
        Assert.AreEqual(expected, actual);

    }
}
