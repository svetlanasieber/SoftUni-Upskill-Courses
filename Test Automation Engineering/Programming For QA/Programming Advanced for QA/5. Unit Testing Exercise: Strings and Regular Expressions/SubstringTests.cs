using NUnit.Framework;

namespace TestApp.UnitTests;

public class SubstringTests
{
    // TODO: finish the test
    [Test]
    public void Test_RemoveOccurrences_RemovesSubstringFromMiddle()
    {
        // Arrange
        string toRemove = "fox";
        string input = "The quick brown fox jumps over the lazy dog";
        string expected = "The quick brown jumps over the lazy dog";

		// Act
        string result = Substring.RemoveOccurrences(toRemove, input);

		// Assert
        Assert.AreEqual(expected, result);
	}

    [Test]
    public void Test_RemoveOccurrences_RemovesSubstringFromStart()
    {
		// Arrange
		string toRemove = "This";
		string input = "This is sample text";
		string expected = "is sample text";

		// Act
		string result = Substring.RemoveOccurrences(toRemove, input);

		// Assert
		Assert.AreEqual(expected, result);
	}

    [Test]
    public void Test_RemoveOccurrences_RemovesSubstringFromEnd()
    {
		// Arrange
		string toRemove = "text";
		string input = "This is sample text";
		string expected = "This is sample";

		// Act
		string result = Substring.RemoveOccurrences(toRemove, input);

		// Assert
		Assert.AreEqual(expected, result);
	}

    [Test]
    public void Test_RemoveOccurrences_RemovesAllOccurrences()
    {
		// Arrange
		string toRemove = "fox";
		string input = "The quick brown fox jumps over the other lazy fox! Crazy fox.";
		string expected = "The quick brown jumps over the other lazy ! Crazy .";

		// Act
		string result = Substring.RemoveOccurrences(toRemove, input);

		// Assert
		Assert.AreEqual(expected, result);
	}
}
