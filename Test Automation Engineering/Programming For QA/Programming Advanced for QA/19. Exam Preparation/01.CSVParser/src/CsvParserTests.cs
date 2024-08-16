using NUnit.Framework;

namespace TestApp.Tests;

[TestFixture]
public class CsvParserTests
{
    [Test]
    public void Test_ParseCsv_EmptyInput_ReturnsEmptyArray()
    {
        //Arrange
        string csvData = string.Empty;

        //Act
        string[] result = CsvParser.ParseCsv(csvData);

        //Assert
        Assert.That(result, Is.Empty);
    }

    [Test]
    public void Test_ParseCsv_SingleField_ReturnsArrayWithOneElement()
    {
        //Arrange
        string csvData = "single element";
        string[] expected = { "single element" };

        //Act
        string[] result = CsvParser.ParseCsv(csvData);

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_ParseCsv_MultipleFields_ReturnsArrayWithMultipleElements()
    {
        //Arrange
        string csvData = "first,second,third";
        string[] expected = { "first", "second", "third" };

        //Act
        string [] result = CsvParser.ParseCsv(csvData);

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_ParseCsv_TrimsWhiteSpace_ReturnsCleanArray()
    {
        //Arrange
        string csvData = "  Ivan,Ivanov,   23, Stara Zagora  ";
        string[] expected = { "Ivan", "Ivanov", "23", "Stara Zagora" };

        //Act
        string[] result = CsvParser.ParseCsv(csvData);

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }
}
