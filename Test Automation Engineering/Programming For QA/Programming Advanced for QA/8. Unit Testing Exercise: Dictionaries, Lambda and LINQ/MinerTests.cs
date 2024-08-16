using NUnit.Framework;

using System;

namespace TestApp.Tests;

public class MinerTests
{
    [Test]
    public void Test_Mine_WithEmptyInput_ShouldReturnEmptyString()
    {
		// Arrange
		string[] input = Array.Empty<string>();

		// Act
		string actual = Miner.Mine(input);

		// Assert
		Assert.That(actual, Is.Empty);
	}

    // TODO: finish test
    [Test]
    public void Test_Mine_WithMixedCaseResources_ShouldBeCaseInsensitive()
    {
        // Arrange
        string[] input = new string[] { "Gold 2", "GOLD 2", "goLd 4" };
        string expected = $"gold -> 8";

		// Act
		string actual = Miner.Mine(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Mine_WithDifferentResources_ShouldReturnResourceCounts()
    {
		// Arrange
		string[] input = new string[] { "Gold 2", "Silver 10", "GOLD 2", "goLd 4", "SILVER 15", "silVeR 5" };
		string expected = $"gold -> 8{Environment.NewLine}silver -> 30";

		// Act
		string actual = Miner.Mine(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}
}
