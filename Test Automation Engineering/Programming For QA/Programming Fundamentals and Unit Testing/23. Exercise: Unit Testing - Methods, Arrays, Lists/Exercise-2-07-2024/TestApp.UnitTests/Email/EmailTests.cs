using NUnit.Framework;

namespace TestApp.UnitTests;

public class EmailTests
{
    // TODO: finish test
    [Test]
    public void Test_IsValidEmail_ValidEmail()
    {
        // Arrange
        string validEmail = "test@example.com";

        // Act
        bool actual = Email.IsValidEmail(validEmail);

        // Assert
        Assert.IsTrue(actual);
        //Assert.AreEqual(true, actual);
        //New Syntax -> Assert.That(actual, Is.True);
    }

    [Test]
    [TestCase("@example.com")]
    //[TestCase("svetlana@example")]
    [TestCase("svetlana@.com")]
    public void Test_IsValidEmail_InvalidEmail(string invalidMail)
    {
        // Arrange
       

        // Act
        bool actual = Email.IsValidEmail(invalidMail);

        //Assert
        Assert.IsFalse(actual);
        //Assert.That(actual, Is.False);
    }

    [Test]
    [TestCase(null)]
    [TestCase("")]
    [TestCase("   ")]
    public void Test_IsValidEmail_NullInput(string emptyMail)
    {
        
        // Arrange


        // Act 
        bool actual = Email.IsValidEmail(emptyMail);
          
        
        // Assert

        Assert.IsFalse(actual);
    }
}
