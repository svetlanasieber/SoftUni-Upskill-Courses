using NUnit.Framework;

namespace TestApp.UnitTests;

public class EmailValidatorTests
{
    // TODO: finish the test
    [TestCase("sample@abv.bg")]
    [TestCase("sample34.lastname@gmail.com")]
    [TestCase("sample.lastname@softuni-student.co.bg")]
    public void Test_ValidEmails_ReturnsTrue(string email)
    {
        // Arrange

        // Act
        bool result = EmailValidator.IsValidEmail(email);

        // Assert
        Assert.That(result, Is.True);
    }

	// TODO: finish the test
	[TestCase("sample@abv.")]
	[TestCase("sample34.lastname@.com")]
	[TestCase("@softuni-student.co.bg")]
	public void Test_InvalidEmails_ReturnsFalse(string email)
    {
        // Arrange

        // Act
        bool result = EmailValidator.IsValidEmail(email);
        
        // Assert
        Assert.IsFalse(result);
    }
}
