using NUnit.Framework;

using System;
using System.Collections.Generic;

namespace TestApp.Tests;

public class CountCharactersTests
{
    [Test]
    public void Test_Count_WithEmptyList_ShouldReturnEmptyString()
    {
        // Arrange
        List<string> input = new();

        // Act
        string actual = CountCharacters.Count(input);

        // Assert
        Assert.That(actual, Is.Empty);
    }

    // TODO: finish test
    [Test]
    public void Test_Count_WithNoCharacters_ShouldReturnEmptyString()
    {
        // Arrange
        List<string> input = new List<string> { "", "" };

        // Act
        string actual = CountCharacters.Count(input);

        // Assert
        Assert.That(actual, Is.Empty);
    }

    [Test]
    public void Test_Count_WithSingleCharacter_ShouldReturnCountString()
    {
		// Arrange
		List<string> input = new List<string> { "a" };
        string expected = "a -> 1";

		// Act
		string actual = CountCharacters.Count(input);

        // Assert
        Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Count_WithMultipleCharacters_ShouldReturnCountString()
    {
		// Arrange
		List<string> input = new List<string> { "a", "ac", "b", "ac" };
        string expected = $"a -> 3{Environment.NewLine}c -> 2{Environment.NewLine}b -> 1";

		// Act
		string actual = CountCharacters.Count(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Count_WithSpecialCharacters_ShouldReturnCountString()
    {
		// Arrange
		List<string> input = new List<string> { "!", "!#", "$", "!#" };
		string expected = $"! -> 3{Environment.NewLine}# -> 2{Environment.NewLine}$ -> 1";

		// Act
		string actual = CountCharacters.Count(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}
}
