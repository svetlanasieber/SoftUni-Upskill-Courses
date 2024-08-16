using NUnit.Framework;

namespace TestApp.UnitTests;

public class MatchPhoneNumbersTests
{
    // TODO: finish the test
    [Test]
    public void Test_Match_ValidPhoneNumbers_ReturnsMatchedNumbers()
    {
        // Arrange
        string phoneNumbers = "+359-2-124-5678 abcdef +359 2 986 5432 xyz +359-2-555-5555";
        string expected = "+359-2-124-5678, +359 2 986 5432, +359-2-555-5555";

        // Act
        string result = MatchPhoneNumbers.Match(phoneNumbers);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_Match_NoValidPhoneNumbers_ReturnsEmptyString()
    {
		// Arrange
		string phoneNumbers = "+359-2 124-5678 abcdef +359 3 986 5432 xyz +359-2-555-55556";
        string expected = string.Empty;

		// Act
		string result = MatchPhoneNumbers.Match(phoneNumbers);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Match_EmptyInput_ReturnsEmptyString()
    {
		// Arrange
		string phoneNumbers = string.Empty;
		string expected = string.Empty;

		// Act
		string result = MatchPhoneNumbers.Match(phoneNumbers);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Match_MixedValidAndInvalidNumbers_ReturnsOnlyValidNumbers()
    {

		// Arrange
		string phoneNumbers = "+359-2-124-5678 abcdef +359 2 986 5432 xyz +359-3-555-5555, +359-2-1234-5678";
		string expected = "+359-2-124-5678, +359 2 986 5432";

		// Act
		string result = MatchPhoneNumbers.Match(phoneNumbers);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}
}
