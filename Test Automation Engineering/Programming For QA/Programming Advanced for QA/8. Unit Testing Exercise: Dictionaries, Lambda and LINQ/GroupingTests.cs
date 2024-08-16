using NUnit.Framework;

using System;
using System.Collections.Generic;

namespace TestApp.Tests;

public class GroupingTests
{
    // TODO: finish test
    [Test]
    public void Test_GroupNumbers_WithEmptyList_ShouldReturnEmptyString()
    {
        // Arrange
        List<int> input = new List<int>();

        // Act
        string actual = Grouping.GroupNumbers(input);

        // Assert
        Assert.That(actual, Is.Empty);
    }

    [Test]
    public void Test_GroupNumbers_WithEvenAndOddNumbers_ShouldReturnGroupedString()
    {
		// Arrange
		List<int> input = new List<int>() { 13, 4, 9, 5, 28 };
        string expected = $"Odd numbers: 13, 9, 5{Environment.NewLine}Even numbers: 4, 28";

		// Act
		string actual = Grouping.GroupNumbers(input);

        // Assert
        Assert.That (actual, Is.EqualTo(expected));

	}

    [Test]
    public void Test_GroupNumbers_WithOnlyEvenNumbers_ShouldReturnGroupedString()
    {
		// Arrange
		List<int> input = new List<int>() { 12, 4, 2, 50, 8 };
		string expected = $"Even numbers: 12, 4, 2, 50, 8";

		// Act
		string actual = Grouping.GroupNumbers(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_GroupNumbers_WithOnlyOddNumbers_ShouldReturnGroupedString()
    {
		// Arrange
		List<int> input = new List<int>() { 1, 13, 5, 57, 9 };
		string expected = $"Odd numbers: 1, 13, 5, 57, 9";

		// Act
		string actual = Grouping.GroupNumbers(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_GroupNumbers_WithNegativeNumbers_ShouldReturnGroupedString()
    {
		// Arrange
		List<int> input = new List<int>() { -1, -13, -5, -57, -9 };
		string expected = $"Odd numbers: -1, -13, -5, -57, -9";

		// Act
		string actual = Grouping.GroupNumbers(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}
}
