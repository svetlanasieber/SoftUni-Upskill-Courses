using NUnit.Framework;

using System;

namespace TestApp.Tests;

public class PlantsTests
{
    [Test]
    public void Test_GetFastestGrowing_WithEmptyArray_ShouldReturnEmptyString()
    {
		// Arrange
		string[] input = Array.Empty<string>();

		// Act
		string actual = Plants.GetFastestGrowing(input);

		// Assert
		Assert.That(actual, Is.Empty);
	}

    // TODO: finish test
    [Test]
    public void Test_GetFastestGrowing_WithSinglePlant_ShouldReturnPlant()
    {
        // Arrange
        string[] input = new string[] { "Rose" };
        string expected = $"Plants with 4 letters:{Environment.NewLine}Rose";

		// Act
		string actual = Plants.GetFastestGrowing(input);

		// Assert
        Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_GetFastestGrowing_WithMultiplePlants_ShouldReturnGroupedPlants()
    {
		// Arrange
		string[] input = new string[] { "Dahlia", "Rose", "Tulip", "Mint", "Orchid" };

		string expected = $"Plants with 4 letters:{Environment.NewLine}" +
						  $"Rose{Environment.NewLine}" +
						  $"Mint{Environment.NewLine}" +
						  $"Plants with 5 letters:{Environment.NewLine}" +
						  $"Tulip{Environment.NewLine}" +
						  $"Plants with 6 letters:{Environment.NewLine}" +
						  $"Dahlia{Environment.NewLine}" +
						  "Orchid";

		// Act
		string actual = Plants.GetFastestGrowing(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_GetFastestGrowing_WithMixedCasePlants_ShouldBeCaseInsensitive()
    {
		// Arrange
		string[] input = new string[] { "dahlia", "RoSe", "TuliP", "OrCHid" };

		string expected = $"Plants with 4 letters:{Environment.NewLine}" +
						  $"RoSe{Environment.NewLine}" +
						  $"Plants with 5 letters:{Environment.NewLine}" +
						  $"TuliP{Environment.NewLine}" +
						  $"Plants with 6 letters:{Environment.NewLine}" +
						  $"dahlia{Environment.NewLine}" +
						  "OrCHid";

		// Act
		string actual = Plants.GetFastestGrowing(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}
}
