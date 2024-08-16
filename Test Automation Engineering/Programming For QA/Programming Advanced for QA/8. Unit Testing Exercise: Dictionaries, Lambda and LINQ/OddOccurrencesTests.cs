using NUnit.Framework;

using System;

namespace TestApp.Tests;

public class OddOccurrencesTests
{
    [Test]
    public void Test_FindOdd_WithEmptyArray_ShouldReturnEmptyString()
    {
		// Arrange
		string[] input = Array.Empty<string>();

		// Act
		string actual = OddOccurrences.FindOdd(input);

		// Assert
		Assert.That(actual, Is.Empty);
	}

    // TODO: finish test
    [Test]
    public void Test_FindOdd_WithNoOddOccurrences_ShouldReturnEmptyString()
    {
		// Arrange
		string[] input = new string[] { "apple", "apple" };

		// Act
		string actual = OddOccurrences.FindOdd(input);

		// Assert
		Assert.That(actual, Is.Empty);
	}

    [Test]
    public void Test_FindOdd_WithSingleOddOccurrence_ShouldReturnTheOddWord()
    {
		// Arrange
		string[] input = new string[] { "apple" };
		string expected = "apple";

		// Act
		string actual = OddOccurrences.FindOdd(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_FindOdd_WithMultipleOddOccurrences_ShouldReturnAllOddWords()
    {
		// Arrange
		string[] input = new string[] { "apple", "banana", "apple", "apple", "banana", "grape" };
		string expected = "apple grape";

		// Act
		string actual = OddOccurrences.FindOdd(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_FindOdd_WithMixedCaseWords_ShouldBeCaseInsensitive()
    {
		// Arrange
		string[] input = new string[] { "apple", "banana", "Apple", "apPle", "Banana", "BANANA" };
		string expected = "apple banana";

		// Act
		string actual = OddOccurrences.FindOdd(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}
}
