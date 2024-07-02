using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class ReverserTests
{
    [Test]
    public void Test_ReverseStrings_WithEmptyArray_ReturnsEmptyArray()
    {
        // Arrange
        string[] inputArray = Array.Empty<string>();

        // Act
        string[] actual = Reverser.ReverseStrings(inputArray);

        // Assert
        Assert.That(actual, Is.Empty);
    }

    // TODO: finish test
    [Test]
    public void Test_ReverseStrings_WithSingleString_ReturnsReversedString()
    {
        // Arrange
        string[] inputArray = new string[] { "Hello" };

        // Act
        string[] actual = Reverser.ReverseStrings(inputArray);

        // Assert
        Assert.That(actual, Is.EqualTo(new[] { "olleH" }));
    }

    [Test]
    public void Test_ReverseStrings_WithMultipleStrings_ReturnsReversedStrings()
    {
        // Arrange
        string[] inputArray = new string[] { "Hello", "Svetlana", "Sieber" };
        string[] expected = new string[] { "olleH", "analtevS", "rebeiS" };

        // Act
        string[] actual = Reverser.ReverseStrings(inputArray);

        // Assert
        Assert.AreEqual(expected, actual);

    }

    [Test]
    public void Test_ReverseStrings_WithSpecialCharacters_ReturnsReversedSpecialCharacters()
    {
        // Arrange
        string[] inputArray = new string[] { "Hello!", "Svetlana", "#Sieber" };
        string[] expected = new string[] { "!olleH", "analtevS", "rebeiS#" };

        // Act
        string[] actual = Reverser.ReverseStrings(inputArray);

        // Assert
        Assert.AreEqual(expected, actual);
    }
}