using NUnit.Framework;

using System.Collections.Generic;

namespace TestApp.UnitTests;

public class PalindromeTests
{
    // TODO: finish test
    [Test]
    public void Test_IsPalindrome_ValidPalindrome_ReturnsTrue()
    {
        // Arrange
        List<string> inputList = new List<string>() { "Hello olleh", "sveTlana  analTevs" };

        // Act
        bool actual = Palindrome.IsPalindrome(inputList);

        // Assert
        Assert.IsTrue(actual);
    }

    // TODO: finish test
    [Test]
    public void Test_IsPalindrome_EmptyList_ReturnsTrue()
    {
        // Arrange
        List<string> words = new();

        // Act


        // Assert
        Assert.That(Palindrome.IsPalindrome(words), Is.True);
    }

    [Test]
    public void Test_IsPalindrome_SingleWord_ReturnsTrue()
    {
        // Arrange
        List<string> inputList = new List<string>() { "Hello olleh" };

        // Act
        bool actual = Palindrome.IsPalindrome(inputList);

        // Assert
        Assert.IsTrue(actual);
    }

    [Test]
    public void Test_IsPalindrome_NonPalindrome_ReturnsFalse()
    {
        // Arrange
        List<string> inputList = new List<string>() { "Hello olh", "sveTlana  something" };

        // Act
        bool actual = Palindrome.IsPalindrome(inputList);

        // Assert
        Assert.IsFalse(actual);
    }

    [Test]
    public void Test_IsPalindrome_MixedCasePalindrome_ReturnsTrue()
    {
        // Arrange
        List<string> inputList = new List<string>() { "Hello olleh", "sveTlana  analtevS" };

        // Act
        bool actual = Palindrome.IsPalindrome(inputList);

        // Assert
        Assert.IsTrue(actual);
    }
}
