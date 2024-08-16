using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class TextFilterTests
{
    // TODO: finish the test
    [Test]
    public void Test_Filter_WhenNoBannedWords_ShouldReturnOriginalText()
    {
        // Arrange
        string[] bannedWords = new string[] { "abc", "xyz" };
        string input = "This is sample text.";
        string expected = "This is sample text.";

		// Act
        string result = TextFilter.Filter(bannedWords, input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Filter_WhenBannedWordExists_ShouldReplaceBannedWordWithAsterisks()
    {
		// Arrange
		string[] bannedWords = new string[] { "bad", "other" };
		string input = "This is sample text with bad words.";
		string expected = "This is sample text with *** words.";

		// Act
		string result = TextFilter.Filter(bannedWords, input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Filter_WhenBannedWordsAreEmpty_ShouldReturnOriginalText()
    {
		// Arrange
		string[] bannedWords = Array.Empty<string>();
		string input = "This is sample text.";
		string expected = "This is sample text.";

		// Act
		string result = TextFilter.Filter(bannedWords, input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Filter_WhenBannedWordsContainWhitespace_ShouldReplaceBannedWord()
    {
		//Arrange
		string[] bannedWords = new string[] { "bad", " " };
		string input = "This is sample text with some words.";
		string expected = "This*is*sample*text*with*some*words.";

		// Act
		string result = TextFilter.Filter(bannedWords, input);

		// Assert
		Assert.That(result, Is.EqualTo(expected));

	}
}
