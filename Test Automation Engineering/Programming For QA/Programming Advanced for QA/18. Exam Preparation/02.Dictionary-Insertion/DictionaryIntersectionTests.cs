using System.Collections.Generic;

using NUnit.Framework;

namespace TestApp.Tests;

[TestFixture]
public class DictionaryIntersectionTests
{
    [Test]
    public void Test_Intersect_TwoEmptyDictionaries_ReturnsEmptyDictionary()
    {
        //Arrange
        Dictionary<string, int> dict1 = new Dictionary<string, int>(); //празен речник
        Dictionary<string, int> dict2 = new Dictionary<string, int>(); //празен речник
        Dictionary<string, int> expectedDictionary = new Dictionary<string, int>(); //празен речник

        //Act
        Dictionary<string, int> result = DictionaryIntersection.Intersect(dict1, dict2);

        //Assert
        Assert.That(result, Is.EquivalentTo(expectedDictionary));
    }

    [Test]
    public void Test_Intersect_OneEmptyDictionaryAndOneNonEmptyDictionary_ReturnsEmptyDictionary()
    {
        //Arrange
        Dictionary<string, int> dict1 = new Dictionary<string, int>(); //празен речник
        Dictionary<string, int> dict2 = new Dictionary<string, int>
        {
            { "Desi", 6},
            { "Ivan", 8}
        };

        Dictionary<string, int> expectedDictionary = new Dictionary<string, int>(); //празен речник

        //Act
        Dictionary<string, int> result = DictionaryIntersection.Intersect(dict1, dict2);

        //Assert
        Assert.That(result, Is.EquivalentTo(expectedDictionary));
    }

    [Test]
    public void Test_Intersect_TwoNonEmptyDictionariesWithNoCommonKeys_ReturnsEmptyDictionary()
    {
        // Arrange
        Dictionary<string, int> dict1 = new Dictionary<string, int>
        {
            {"Georgi", 10 },
            { "Mitko", 11}
        };
        Dictionary<string, int> dict2 = new Dictionary<string, int>
        {
            { "Desi", 6},
            { "Ivan", 8}
        };

        Dictionary<string, int> expectedDictionary = new Dictionary<string, int>(); //празен речник

        //Act
        Dictionary<string, int> result = DictionaryIntersection.Intersect(dict1, dict2);

        //Assert
        Assert.That(result, Is.EquivalentTo(expectedDictionary));
    }

    [Test]
    public void Test_Intersect_TwoNonEmptyDictionariesWithCommonKeysAndValues_ReturnsIntersectionDictionary()
    {
        //Arrange
        Dictionary<string, int> dict1 = new Dictionary<string, int>
        {
            {"Georgi", 10 },
            { "Mitko", 11}
        };
        Dictionary<string, int> dict2 = new Dictionary<string, int>
        {
            { "Georgi", 10},
            { "Ivan", 8}
        };

        Dictionary<string, int> expectedDictionary = new Dictionary<string, int>
        {
            {"Georgi", 10 }
        };

        //Act
        Dictionary<string, int> result = DictionaryIntersection.Intersect(dict1, dict2);

        //Assert
        Assert.That(result, Is.EquivalentTo(expectedDictionary));
    }

    [Test]
    public void Test_Intersect_TwoNonEmptyDictionariesWithCommonKeysAndDifferentValues_ReturnsEmptyDictionary()
    {
        //Arrange
        Dictionary<string, int> dict1 = new Dictionary<string, int>
        {
            {"Georgi", 10 },
            { "Mitko", 11}
        };
        Dictionary<string, int> dict2 = new Dictionary<string, int>
        {
            { "Georgi", 90},
            { "Ivan", 8}
        };

        Dictionary<string, int> expectedDictionary = new Dictionary<string, int>();

        //Act
        Dictionary<string, int> result = DictionaryIntersection.Intersect(dict1, dict2);

        //Assert
        Assert.That(result, Is.EquivalentTo(expectedDictionary));
    }
}