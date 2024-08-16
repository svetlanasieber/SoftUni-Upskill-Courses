using NUnit.Framework;

namespace TestApp.Tests;

[TestFixture]
public class SubstringExtractorTests
{
    [Test]
    public void Test_ExtractSubstringBetweenMarkers_SubstringFound_ReturnsExtractedSubstring()
    {
        // Arrange
        string input = "Hello, my name is: Diyan Apostolov.";
        string startMarker = ": ";
        string endMarker = " Apos";
        string expected = "Diyan";

        // Act
        string actual = SubstringExtractor.ExtractSubstringBetweenMarkers(input, startMarker, endMarker);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_ExtractSubstringBetweenMarkers_StartMarkerNotFound_ReturnsNotFoundMessage()
    {
		// Arrange
		string input = "Hello, my name is: Diyan Apostolov.";
		string startMarker = "#";
		string endMarker = " Apos";
        string expected = "Substring not found";

		// Act
		string actual = SubstringExtractor.ExtractSubstringBetweenMarkers(input, startMarker, endMarker);

		// Assert
		Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_ExtractSubstringBetweenMarkers_EndMarkerNotFound_ReturnsNotFoundMessage()
    {
		// Arrange
		string input = "Hello, my name is: Diyan Apostolov.";
		string startMarker = ":";
		string endMarker = "$";
		string expected = "Substring not found";

		// Act
		string actual = SubstringExtractor.ExtractSubstringBetweenMarkers(input, startMarker, endMarker);

		// Assert
		Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_ExtractSubstringBetweenMarkers_StartAndEndMarkersNotFound_ReturnsNotFoundMessage()
    {
		// Arrange
		string input = "Hello, my name is: Diyan Apostolov.";
		string startMarker = "#";
		string endMarker = "$";
		string expected = "Substring not found";

		// Act
		string actual = SubstringExtractor.ExtractSubstringBetweenMarkers(input, startMarker, endMarker);

		// Assert
		Assert.AreEqual(expected, actual);
	}

    [Test]
	[TestCase(null)]
	[TestCase("")]
    public void Test_ExtractSubstringBetweenMarkers_EmptyInput_ReturnsNotFoundMessage(string input)
    {
		// Arrange
		string startMarker = "#";
		string endMarker = "$";
		string expected = "Substring not found";

		// Act
		string actual = SubstringExtractor.ExtractSubstringBetweenMarkers(input, startMarker, endMarker);

		// Assert
		Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_ExtractSubstringBetweenMarkers_StartAndEndMarkersOverlapping_ReturnsNotFoundMessage()
    {
		// Arrange
		string input = "Hello, my name is: #Diyan Apostolov.";
		string startMarker = "#";
		string endMarker = "#";
		string expected = "Substring not found";

		// Act
		string actual = SubstringExtractor.ExtractSubstringBetweenMarkers(input, startMarker, endMarker);

		// Assert
		Assert.AreEqual(expected, actual);
	}
}
