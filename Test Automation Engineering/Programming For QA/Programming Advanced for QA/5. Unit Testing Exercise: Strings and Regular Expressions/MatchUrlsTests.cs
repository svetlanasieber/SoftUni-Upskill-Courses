using NUnit.Framework;

using System.Collections.Generic;

namespace TestApp.UnitTests;

public class MatchUrlsTests
{
    // TODO: finish the test
    [Test]
    public void Test_ExtractUrls_EmptyText_ReturnsEmptyList()
    {
        // Arrange
        string text = "";

        // Act
        List<string> result = MatchUrls.ExtractUrls(text);

        // Assert
        Assert.AreEqual(0, result.Count);
        Assert.That(result, Is.Empty);
    }

    // TODO: finish the test
    [Test]
    public void Test_ExtractUrls_NoUrlsInText_ReturnsEmptyList()
    {
		// Arrange
		string text = "This is sample text with no URLs";

		// Act
		List<string> result = MatchUrls.ExtractUrls(text);

		// Assert
		Assert.AreEqual(0, result.Count);
		Assert.That(result, Is.Empty);
	}

    [Test]
    public void Test_ExtractUrls_SingleUrlInText_ReturnsSingleUrl()
    {
		// Arrange
		string text = "This is sample text with URLs: http://www.judge.softuni.org";

		// Act
		List<string> result = MatchUrls.ExtractUrls(text);

		// Assert
		Assert.AreEqual(1, result.Count);
        Assert.AreEqual(result[0], "http://www.judge.softuni.org");
	}

    [Test]
    public void Test_ExtractUrls_MultipleUrlsInText_ReturnsAllUrls()
    {
		// Arrange
		string text = "This is sample text with URLs: http://www.judge.softuni.org, https://softuni-break.github.io, http://judge.softuni.org";

		// Act
		List<string> result = MatchUrls.ExtractUrls(text);

		// Assert
		Assert.AreEqual(3, result.Count);
		Assert.AreEqual(result[0], "http://www.judge.softuni.org");
		Assert.AreEqual(result[1], "https://softuni-break.github.io");
		Assert.AreEqual(result[2], "http://judge.softuni.org");
	}

    [Test]
    public void Test_ExtractUrls_UrlsInQuotationMarks_ReturnsUrlsInQuotationMarks()
    {
		// Arrange
		string text = "This is sample text with URLs: \"http://www.judge.softuni.org\"";

		// Act
		List<string> result = MatchUrls.ExtractUrls(text);

		// Assert
		Assert.AreEqual(1, result.Count);
		Assert.AreEqual(result[0], "http://www.judge.softuni.org");
	}
}
