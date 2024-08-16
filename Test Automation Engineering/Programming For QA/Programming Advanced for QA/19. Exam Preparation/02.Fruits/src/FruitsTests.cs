using System.Collections.Generic;

using NUnit.Framework;

namespace TestApp.Tests;

[TestFixture]
public class FruitsTests
{
    [Test]
    public void Test_GetFruitQuantity_FruitExists_ReturnsQuantity()
    {
        //Arrange
        Dictionary<string, int> fruitsDictionary = new Dictionary<string, int>
        {
            {"banana", 3},
            {"apple", 4},
            {"peach", 2}
        };

        string searchedFruit = "apple";
        int expectedQuantity = 4;

        //Act
        int resultQuantity = Fruits.GetFruitQuantity(fruitsDictionary, searchedFruit);

        //Assert
        Assert.That(resultQuantity, Is.EqualTo(expectedQuantity));
    }

    [Test]
    public void Test_GetFruitQuantity_FruitDoesNotExist_ReturnsZero()
    {
        //Arrange
        Dictionary<string, int> fruitsDictionary = new Dictionary<string, int>
        {
            {"banana", 3},
            {"apple", 4},
            {"peach", 2}
        };
        string searchedFruit = "kiwi";
        int expectedQuantity = 0;

        //Act
        int resultQuantity = Fruits.GetFruitQuantity(fruitsDictionary, searchedFruit);

        //Assert
        Assert.That(resultQuantity, Is.EqualTo(expectedQuantity));
    }

    [Test]
    public void Test_GetFruitQuantity_EmptyDictionary_ReturnsZero()
    {
        //Arrange
        Dictionary<string, int> fruitsDictionary = new Dictionary<string, int>(); //празен речник
        string searchedFruit = "kiwi";
        int expectedQuantity = 0;

        //Act
        int resultQuantity = Fruits.GetFruitQuantity(fruitsDictionary, searchedFruit);

        //Assert
        Assert.That(resultQuantity, Is.EqualTo(expectedQuantity));
    }

    [Test]
    public void Test_GetFruitQuantity_NullDictionary_ReturnsZero()
    {
        //Arrange
        Dictionary<string, int> fruitsDictionary = null;
        string searchedFruit = "kiwi";
        int expectedQuantity = 0;

        //Act
        int resultQuantity = Fruits.GetFruitQuantity(fruitsDictionary, searchedFruit);

        //Assert
        Assert.That(resultQuantity, Is.EqualTo(expectedQuantity));
    }

    [Test]
    public void Test_GetFruitQuantity_NullFruitName_ReturnsZero()
    {
        //Arrange
        Dictionary<string, int> fruitsDictionary = new Dictionary<string, int>
        {
            {"banana", 3},
            {"apple", 4},
            {"peach", 2}
        };
        string searchedFruit = null;
        int expectedQuantity = 0;

        //Act
        int resultQuantity = Fruits.GetFruitQuantity(fruitsDictionary, searchedFruit);

        //Assert
        Assert.That(resultQuantity, Is.EqualTo(expectedQuantity));
    }
}
