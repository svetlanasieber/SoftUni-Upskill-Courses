using NUnit.Framework;
using System;


namespace TestApp.UnitTests;

public class PatternTests
{
    // TODO: finish the test cases
    [TestCase("abcdef", 4, "aBcDeFaBcDeFaBcDeFaBcDeF")]
    [TestCase("DiyaN", 3, "dIyAndIyAndIyAn")]
    [TestCase("12345", 2, "1234512345")]
	[TestCase("abc def", 2, "aBc dEfaBc dEf")]
	public void Test_GeneratePatternedString_ValidInput_ReturnsExpectedResult(string input, 
        int repetitionFactor, string expected)
    {
        // Arrange

        // Act
        string result = Pattern.GeneratePatternedString(input, repetitionFactor);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_GeneratePatternedString_EmptyInput_ThrowsArgumentException()
    {
		Assert.That(() => Pattern.GeneratePatternedString(string.Empty, 3), Throws.ArgumentException);
	}

    [Test]
    public void Test_GeneratePatternedString_NegativeRepetitionFactor_ThrowsArgumentException()
    {
		Assert.Throws<ArgumentException>(() => Pattern.GeneratePatternedString("abc", -1));
	}

    [Test]
    public void Test_GeneratePatternedString_ZeroRepetitionFactor_ThrowsArgumentException()
    {
		Assert.Throws<ArgumentException>(() => Pattern.GeneratePatternedString("abc", 0));
	}
}
