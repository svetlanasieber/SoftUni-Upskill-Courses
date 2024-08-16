using NUnit.Framework;

using System;

namespace TestApp.Tests;

public class CountRealNumbersTests
{
    // TODO: finish test
    [Test]
    public void Test_Count_WithEmptyArray_ShouldReturnEmptyString()
    {
        // Arrange
        int[] input = Array.Empty<int>();

        // Act
        string actual = CountRealNumbers.Count(input);

        // Assert
        Assert.That(actual, Is.Empty);
    }

    [Test]
    public void Test_Count_WithSingleNumber_ShouldReturnCountString()
    {
		// Arrange
		int[] input = new int[] { 55 };
        string expected = "55 -> 1";

		// Act
		string actual = CountRealNumbers.Count(input);

        // Assert 
        Assert.That (actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Count_WithMultipleNumbers_ShouldReturnCountString()
    {
		// Arrange
		int[] input = new int[] { 55, 2, 9, 28, 9, 55, 9 };
		string expected = $"2 -> 1{Environment.NewLine}9 -> 3{Environment.NewLine}28 -> 1{Environment.NewLine}55 -> 2";

		// Act
		string actual = CountRealNumbers.Count(input);

		// Assert 
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Count_WithNegativeNumbers_ShouldReturnCountString()
    {
		// Arrange
		int[] input = new int[] { -55, -2, -9, -28, -9, -55, -9 };
		string expected = $"-55 -> 2{Environment.NewLine}-28 -> 1{Environment.NewLine}-9 -> 3{Environment.NewLine}-2 -> 1";

		// Act
		string actual = CountRealNumbers.Count(input);

		// Assert 
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Count_WithZero_ShouldReturnCountString()
    {
		// Arrange
		int[] input = new int[] {  2, 9, 0, 9, -3, 9 };
		string expected = $"-3 -> 1{Environment.NewLine}0 -> 1{Environment.NewLine}2 -> 1{Environment.NewLine}9 -> 3";

		// Act
		string actual = CountRealNumbers.Count(input);

		// Assert 
		Assert.That(actual, Is.EqualTo(expected));
	}
}
