using NUnit.Framework;
using System;

namespace TestApp.Tests;

public class LongestIncreasingSubsequenceTests
{
    [Test]
    public void Test_GetLis_NullArray_ThrowsArgumentNullException()
    {
        // Arrange
        int[] inputNumbers = null;



        // Act & Assert
        Assert.Throws<ArgumentNullException>(() => 
           LongestIncreasingSubsequence.GetLis(inputNumbers));


    }

    [Test]
    public void Test_GetLis_EmptyArray_ReturnsEmptyString()
    {
        // Arrange
        int[] inputNumbers = new int[0];

        // Act
        string actual = LongestIncreasingSubsequence.GetLis(inputNumbers);

        //Assert
        Assert.That(actual, Is.EqualTo(""));
    }

    [Test]
    public void Test_GetLis_SingleElementArray_ReturnsElement()
    {
        // Arrange
        int[] inputNumbers = new int[] { 1 };

        // Act
        string actual = LongestIncreasingSubsequence.GetLis(inputNumbers);

        //Assert
        Assert.That(actual, Is.EqualTo("1"));
    }

    [Test]
    public void Test_GetLis_UnsortedArray_ReturnsLongestIncreasingSubsequence()
    {
        // Arrange
        int[] inputNumbers = new int[] { 5, 1, 12, 2, 15, 4 };
        // Act
        string actual = LongestIncreasingSubsequence.GetLis(inputNumbers);

        //Assert
        Assert.That(actual, Is.EqualTo("5 12 15"));
    }

    [Test]
    public void Test_GetLis_SortedArray_ReturnsItself()
    {
        // Arrange
        int[] inputNumbers = new int[] { 5, 10, 15, 20, 25 };

        // Act
        string actual = LongestIncreasingSubsequence.GetLis(inputNumbers);

        //Assert
        Assert.That(actual, Is.EqualTo("5 10 15 20 25"));
    }
}
