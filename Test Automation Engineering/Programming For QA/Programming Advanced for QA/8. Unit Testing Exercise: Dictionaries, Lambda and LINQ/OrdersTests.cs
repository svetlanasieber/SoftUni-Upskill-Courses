using System;
using NUnit.Framework;

namespace TestApp.Tests;

public class OrdersTests
{
    [Test]
    public void Test_Order_WithEmptyInput_ShouldReturnEmptyString()
    {
		// Arrange
		string[] input = Array.Empty<string>();

		// Act
		string actual = Orders.Order(input);

		// Assert
		Assert.That(actual, Is.Empty);
	}

    // TODO: finish test
    [Test]
    public void Test_Order_WithMultipleOrders_ShouldReturnTotalPrice()
    {
        // Arrange
        string[] input = new string[] { "apple 1.5 1", "apple 1.2 1", "banana 1.25 1", "apple 1.99 1", "banana 1.25 2", "orange 0.5 1", "orange 0.99 1" };
        string expected = $"apple -> 5.97{Environment.NewLine}banana -> 3.75{Environment.NewLine}orange -> 1.98";

		// Act
		string actual = Orders.Order(input);

		// Assert
        Assert.That (actual, Is.EqualTo(expected));

	}

    [Test]
    public void Test_Order_WithRoundedPrices_ShouldReturnTotalPrice()
    {
		// Arrange
		string[] input = new string[] { "apple 1.5 1", "apple 1.2 1", "banana 1.25 1", "apple 2 1", "banana 1 2" };
		string expected = $"apple -> 6.00{Environment.NewLine}banana -> 3.00";

		// Act
		string actual = Orders.Order(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Order_WithDecimalQuantities_ShouldReturnTotalPrice()
    {
		// Arrange
		string[] input = new string[] { "apple 1.5 1.5", "apple 1.2 1.5", "banana 1.25 1.2", "apple 2 1.5", "banana 2 1.4" };
		string expected = $"apple -> 9.00{Environment.NewLine}banana -> 5.20";

		// Act
		string actual = Orders.Order(input);

		// Assert
		Assert.That(actual, Is.EqualTo(expected));
	}
}
