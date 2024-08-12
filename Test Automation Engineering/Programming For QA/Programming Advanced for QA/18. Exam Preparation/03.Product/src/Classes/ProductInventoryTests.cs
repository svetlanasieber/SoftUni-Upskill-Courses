using NUnit.Framework;

using TestApp.Product;

namespace TestApp.Tests;

[TestFixture]
public class ProductInventoryTests
{
    private ProductInventory _inventory = null!;
    //_inventory -> списък с продукти

    [SetUp]
    public void SetUp()
    {
        this._inventory = new();
    }

    [Test]
    public void Test_AddProduct_ProductAddedToInventory()
    {
        //Arrange
        //данни за продукт
        string productName = "Bread";
        double productPrice = 2.30;
        int productQuantity = 3;

        string expected =
            $"Product Inventory:{System.Environment.NewLine}" +
            $"{productName} - Price: ${productPrice:f2} - Quantity: {productQuantity}";

        //Act
        _inventory.AddProduct(productName, productPrice, productQuantity);
        //добавяме продукт към списъка с продукти на инвентара
        //_inventory имам списък с 1 продукт: Bread, 2.30, 5
        string result = _inventory.DisplayInventory();

        //Assert
        Assert.That(result, Is.EqualTo(expected));

    }

    [Test]
    public void Test_DisplayInventory_NoProducts_ReturnsEmptyString()
    {
        //Arrange
        //_inventory -> списък с продукти
        string expected = $"Product Inventory:";

        //Act
        string result = _inventory.DisplayInventory();

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_DisplayInventory_WithProducts_ReturnsFormattedInventory()
    {
        //Arrange
        _inventory.AddProduct("Bread", 2.30, 3);
        _inventory.AddProduct("Cheese", 9.90, 4);
        //добавяме продукти към списъка с продукти на инвентара
        //_inventory имам списък с 2 продукта:
        //Bread, 2.30, 3 -> 2.30 * 3 = 6.90
        //Cheese, 9.90, 4 -> 9.90 * 4 = 39.60
        //Total: 46.50
        string expected =
            $"Product Inventory:{System.Environment.NewLine}" +
            $"Bread - Price: $2.30 - Quantity: 3{System.Environment.NewLine}" +
            $"Cheese - Price: $9.90 - Quantity: 4";

        //Act
        string result = _inventory.DisplayInventory();

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_CalculateTotalValue_NoProducts_ReturnsZero()
    {
        //Arrange
        //_inventory -> празен списък с продукти
        double expectedValue = 0.0;

        //Act
        double result = _inventory.CalculateTotalValue();

        //Assert
        Assert.That(result, Is.EqualTo(expectedValue));
    }

    [Test]
    public void Test_CalculateTotalValue_WithProducts_ReturnsTotalValue()
    {
        //Arrange
        _inventory.AddProduct("Bread", 2.30, 3);
        _inventory.AddProduct("Cheese", 9.90, 4);
        //добавяме продукти към списъка с продукти на инвентара
        //_inventory имам списък с 2 продукта:
        //Bread, 2.30, 3 -> 2.30 * 3 = 6.90
        //Cheese, 9.90, 4 -> 9.90 * 4 = 39.60
        //Total: 46.50
        double expectedValue = 2.30 * 3 + 9.90 * 4;

        //Act
        double result = _inventory.CalculateTotalValue();

        //Assert
        Assert.That(result, Is.EqualTo(expectedValue));
    }
}