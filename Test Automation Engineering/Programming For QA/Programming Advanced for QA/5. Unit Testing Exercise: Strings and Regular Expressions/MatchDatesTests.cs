using NUnit.Framework;
using System;

namespace TestApp.UnitTests;

public class MatchDatesTests
{
    // TODO: finish the test
    [Test]
    public void Test_Match_ValidDate_ReturnsExpectedResult()
    {
        // Arrange
        string dates = "31-Dec-2022";
        string expected = "Day: 31, Month: Dec, Year: 2022";

        // Act
        string result = MatchDates.Match(dates);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    // TODO: finish the test
    [Test]
    public void Test_Match_NoMatch_ReturnsEmptyString()
    {
        // Arrange
        string input = "31 Dec 2022, 31-dec-2022, 5-Dec-2022";
        string expected = string.Empty;

		// Act
		string result = MatchDates.Match(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Match_MultipleMatches_ReturnsFirstMatch()
    {
		// Arrange
		string input = "31-Dec-2022, 25-Jan-2024, 05-May-2024";
        string expected = "Day: 31, Month: Dec, Year: 2022";

		// Act
		string result = MatchDates.Match(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Match_EmptyString_ReturnsEmptyString()
    {
		// Arrange
		string input = string.Empty;
		string expected = string.Empty;

		// Act
		string result = MatchDates.Match(input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Match_NullInput_ThrowsArgumentException()
    {
        Assert.Throws<ArgumentException>(() => MatchDates.Match(null));
    }
}
