using NUnit.Framework;

namespace TestApp.Tests;

[TestFixture]
public class StringRotatorTests
{
    [Test]
    public void Test_RotateRight_EmptyString_ReturnsEmptyString()
    {
        // Arrange
        string input = "";
        int position = 3;
        string expected = "";
        // Act
        string result = StringRotator.RotateRight(input, position);
        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_RotateRight_RotateByZeroPositions_ReturnsOriginalString()
    {
        // Arrange
        string input = "hello";
        int position = 0;
        string expected = "hello";
        // Act
        string result = StringRotator.RotateRight(input, position);
        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_RotateRight_RotateByPositivePositions_ReturnsRotatedString()
    {
        // Arrange
        string input = "hello";
        int rotation = 2;
        string expected = "lohel";
        // Act
        string result = StringRotator.RotateRight(input, rotation);
        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_RotateRight_RotateByNegativePositions_ReturnsRotatedString()
    {
        // Arrange
        string input = "hello";
        int rotation = -3;
        string expected = "llohe";
        // Act
        string result = StringRotator.RotateRight(input, rotation);
        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_RotateRight_RotateByMorePositionsThanStringLength_ReturnsRotatedString()
    {
        // Arrange
        string input = "hello";
        int position = 12;
        string expected = "lohel";
        // Act
        string result = StringRotator.RotateRight(input, position);
        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }
}
