using NUnit.Framework;

using System;
using System.Linq;

namespace TestApp.UnitTests;

public class ReverseConcatenateTests
{
    // TODO: finish the test
    [Test]
    public void Test_ReverseAndConcatenateStrings_EmptyInput_ReturnsEmptyString()
    {
        // Arrange
        string[] input = Array.Empty<string>();
        string expected = string.Empty;

        // Act
        string result = ReverseConcatenate.ReverseAndConcatenateStrings(input);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    // TODO: finish the test
    [Test]
    public void Test_ReverseAndConcatenateStrings_SingleString_ReturnsSameString()
    {
        // Arrange
        string[] input = new string[] { "abc" };
        string expected = "abc";

        // Act
        string result = ReverseConcatenate.ReverseAndConcatenateStrings(input);

        // Assert
        Assert.That (result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_ReverseAndConcatenateStrings_MultipleStrings_ReturnsReversedConcatenatedString()
    {
        //Arrange
        string[] input = new string[] { "Apostolov", "Petrov", "Diyan" };
        string expected = "DiyanPetrovApostolov";

		// Act
		string result = ReverseConcatenate.ReverseAndConcatenateStrings(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_ReverseAndConcatenateStrings_NullInput_ReturnsEmptyString()
    {
		// Arrange
		string[] input = null;
		string expected = string.Empty;

		// Act
		string result = ReverseConcatenate.ReverseAndConcatenateStrings(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_ReverseAndConcatenateStrings_WhitespaceInput_ReturnsConcatenatedString()
    {
		//Arrange
		string[] input = new string[] { "Apostolov", " ", "Diyan" };
		string expected = "Diyan Apostolov";

		// Act
		string result = ReverseConcatenate.ReverseAndConcatenateStrings(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_ReverseAndConcatenateStrings_LargeInput_ReturnsReversedConcatenatedString()
    {
        //Arrange
        string[] input = new string[10000];
        for (int i = 0; i < 10000; i++)
        {
            input[i] = i.ToString();
        }
        string expected = string.Join("", input.Reverse());

		// Act
		string result = ReverseConcatenate.ReverseAndConcatenateStrings(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}
}
