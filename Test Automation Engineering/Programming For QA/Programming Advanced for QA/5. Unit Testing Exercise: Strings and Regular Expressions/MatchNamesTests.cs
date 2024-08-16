using NUnit.Framework;

namespace TestApp.UnitTests;

public class MatchNamesTests
{
    [Test]
    public void Test_Match_ValidNames_ReturnsMatchedNames()
    {
        // Arrange
        string names = "John Smith and Alice Johnson and some other text.";
        string expected = "John Smith Alice Johnson";

        // Act
        string result = MatchNames.Match(names);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_Match_NoValidNames_ReturnsEmptyString()
    {
        //Arrange 
        string names = "diyan Apostolov and iVan petrOv and Gosho milkov";
        string expected = string.Empty;

		// Act
		string result = MatchNames.Match(names);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}

    [Test]
    public void Test_Match_EmptyInput_ReturnsEmptyString()
    {
		//Arrange 
		string names = string.Empty;
		string expected = string.Empty;

		// Act
		string result = MatchNames.Match(names);

		// Assert
		Assert.That(result, Is.EqualTo(expected));
	}
}
