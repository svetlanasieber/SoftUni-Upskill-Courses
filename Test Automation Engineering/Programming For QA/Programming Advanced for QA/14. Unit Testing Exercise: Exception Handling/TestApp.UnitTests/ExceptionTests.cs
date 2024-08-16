using NUnit.Framework;

using System;
using System.Collections.Generic;

namespace TestApp.UnitTests;

public class ExceptionTests
{
    private Exceptions _exceptions = null!;

    [SetUp]
    public void SetUp()
    {
        _exceptions = new();
	}

    // TODO: finish test
    [Test]
    public void Test_Reverse_ValidString_ReturnsReversedString()
    {
        // Arrange
        string input = "hello";
        string expected = "olleh";

        // Act
        string actual = _exceptions.ArgumentNullReverse(input);

        // Assert
        Assert.That(actual, Is.EqualTo(expected));
    }

    // TODO: finish test
    [Test]
    public void Test_Reverse_NullString_ThrowsArgumentNullException()
    {
        // Arrange
        string input = null;

        // Act & Assert
        Assert.Throws<ArgumentNullException>(() => _exceptions.ArgumentNullReverse(input));
    }
        
    [Test]
    public void Test_CalculateDiscount_ValidInput_ReturnsDiscountedPrice()
    {
        // Arrange
        decimal finalPrice = 200;
        decimal discount = 10;
        decimal expected = 180;

        // Act
        decimal actual = _exceptions.ArgumentCalculateDiscount(finalPrice, discount);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    // TODO: finish test
    [Test]
    public void Test_CalculateDiscount_NegativeDiscount_ThrowsArgumentException()
    {
		// Arrange
		decimal finalPrice = 200;
        decimal discount = -10;

		// Act & Assert
		ArgumentException result = Assert.Throws<ArgumentException>(() => _exceptions.ArgumentCalculateDiscount(finalPrice, discount));

        Assert.AreEqual(result.Message, "Discount must be between 0 and 100. (Parameter 'discount')"); // Judge                  
	}

    // TODO: finish test
    [Test]
    public void Test_CalculateDiscount_DiscountOver100_ThrowsArgumentException()
    {
        // Arrange
        decimal finalPrice = 100.0m;
        decimal discount = 110.0m;

        // Act & Assert
        Assert.That(() => _exceptions.ArgumentCalculateDiscount(finalPrice, discount), Throws.ArgumentException); //                                   

		Assert.Throws<ArgumentException>(() => _exceptions.ArgumentCalculateDiscount(finalPrice, discount));

	}

    [Test]
    public void Test_GetElement_ValidIndex_ReturnsElement()
    {
        // Arrange
        int[] input = { 1, 3, 5, 7, 9 };
        int index = 2;
        int expected = 5;

        // Act 
        int actual = _exceptions.IndexOutOfRangeGetElement(input, index);

        // Assert 
        Assert.AreEqual(expected, actual);   
    }

    // TODO: finish test
    [Test]
    public void Test_GetElement_IndexLessThanZero_ThrowsIndexOutOfRangeException()
    {
		// Arrange
		int[] input = { 1, 3, 5, 7, 9 };
		int index = -1;

        // Act & Assert
        //Assert.That(() => this._exceptions.IndexOutOfRangeGetElement(input, index), Throws.TypeOf<IndexOutOfRangeException>());

        Assert.Throws<IndexOutOfRangeException>(() => this._exceptions.IndexOutOfRangeGetElement(input, index));
    }

    // TODO: finish test
    [Test]
    public void Test_GetElement_IndexEqualToArrayLength_ThrowsIndexOutOfRangeException()
    {
		// Arrange
		int[] input = { 1, 3, 5, 7, 9 };
		int index = input.Length;

		// Act & Assert
		Assert.Throws<IndexOutOfRangeException>(() => this._exceptions.IndexOutOfRangeGetElement(input, index));
	}

    [Test]
    public void Test_GetElement_IndexGreaterThanArrayLength_ThrowsIndexOutOfRangeException()
    {
		// Arrange
		int[] input = { 1, 3, 5, 7, 9 };
		int index = 8;

		// Act & Assert
		IndexOutOfRangeException result = Assert.Throws<IndexOutOfRangeException>(() => this._exceptions.IndexOutOfRangeGetElement(input, index));

        Assert.AreEqual(result.Message, "Index is out of range."); // Judge                  
	}

    [Test]
    public void Test_PerformSecureOperation_UserLoggedIn_ReturnsUserLoggedInMessage()
    {
        // Arrange
        bool isLoggedIn = true;
        string expected = "User logged in.";

        // Act
        string actual = _exceptions.InvalidOperationPerformSecureOperation(isLoggedIn);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_PerformSecureOperation_UserNotLoggedIn_ThrowsInvalidOperationException()
    {
		// Arrange
		bool isLoggedIn = false;

		// Arrange and Act and Assert
		Assert.Throws<InvalidOperationException>(() => _exceptions.InvalidOperationPerformSecureOperation(false));
	}

    [Test]
    public void Test_ParseInt_ValidInput_ReturnsParsedInteger()
    {
        // Arrange
        string input = "5";
        int expected = 5;

        // Act
        int actual = _exceptions.FormatExceptionParseInt(input);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_ParseInt_InvalidInput_ThrowsFormatException()
    {
		// Arrange
		string input = "a";

        // Act and Assert
        Assert.Throws<FormatException>(() => _exceptions.FormatExceptionParseInt(input));
	}

    [Test]
    public void Test_FindValueByKey_KeyExistsInDictionary_ReturnsValue()
    {
        // Arrange
        Dictionary<string, int> dict = new Dictionary<string, int>()
        {
            ["one"] = 1,
            ["two"] = 2,
            ["three"] = 3
        };
        string key = "two";
        int expected = 2;

        // Act
        int actual = _exceptions.KeyNotFoundFindValueByKey(dict, key);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_FindValueByKey_KeyDoesNotExistInDictionary_ThrowsKeyNotFoundException()
    {
		// Arrange
		Dictionary<string, int> dict = new Dictionary<string, int>()
		{
			["one"] = 1,
			["two"] = 2,
			["three"] = 3
		};
		string invalidKey = "four";

        // Act and Assert
        Assert.Throws<KeyNotFoundException>(() => _exceptions.KeyNotFoundFindValueByKey(dict, invalidKey));
	}

    [Test]
    public void Test_AddNumbers_NoOverflow_ReturnsSum()
    {
        // Arrange
        int a = 5;
        int b = 7;
        int expected = 12;

        // Act
        int actual = _exceptions.OverflowAddNumbers(a, b);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_AddNumbers_PositiveOverflow_ThrowsOverflowException()
    {
        // Arrange
        int a = int.MaxValue;
        int b = 1;

        // Act and Assert
        Assert.Throws<OverflowException>(() => _exceptions.OverflowAddNumbers(a, b));
	}

    [Test]
    public void Test_AddNumbers_NegativeOverflow_ThrowsOverflowException()
    {
		// Arrange
		int a = int.MinValue;
		int b = -1;

		// Act and Assert
		Assert.Throws<OverflowException>(() => _exceptions.OverflowAddNumbers(a, b));
	}

    [Test]
    public void Test_DivideNumbers_ValidDivision_ReturnsQuotient()
    {
        // Assert
        int dividend = 13;
        int divisor = 3;
        int expected = 4;

        // Act
        int actual = _exceptions.DivideByZeroDivideNumbers(dividend, divisor);

        // Assert
        Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_DivideNumbers_DivideByZero_ThrowsDivideByZeroException()
    {
		// Assert
		int dividend = 12;
		int divisor = 0;

        // Act and Assert
        Assert.Throws<DivideByZeroException>(() => _exceptions.DivideByZeroDivideNumbers(dividend, divisor));
	}

    [Test]
    public void Test_SumCollectionElements_ValidCollectionAndIndex_ReturnsSum()
    {
        // Arrange
        int[] input = { 1, 2, 3, 4, 5 };
        int index = 2;
        int expected = 15;

        // Act
        int actual = _exceptions.SumCollectionElements(input, index);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_SumCollectionElements_NullCollection_ThrowsArgumentNullException()
    {
        // Arrange
        int[] input = null;
		int index = 2;

		// Act and Assert
		Assert.Throws<ArgumentNullException>(() => _exceptions.SumCollectionElements(input, index));

	}

    [Test]
    [TestCase(-1)]
    [TestCase(5)]
    [TestCase(8)]
    public void Test_SumCollectionElements_IndexOutOfRange_ThrowsIndexOutOfRangeException(int index)
    {
		// Arrange
		int[] input = { 1, 2, 3, 4, 5 };

        // Act and Assert
        Assert.Throws<IndexOutOfRangeException>(() => _exceptions.SumCollectionElements(input, index));
	}

    [Test]
    public void Test_GetElementAsNumber_ValidKey_ReturnsParsedNumber()
    {
		// Arrange
		Dictionary<string, string> dict = new Dictionary<string, string>()
		{
			["one"] = "1",
			["two"] = "2",
			["three"] = "3"
		};
		string key = "two";
        int expected = 2;

        // Act 
        int actual = _exceptions.GetElementAsNumber(dict, key);

        // Assert
        Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_GetElementAsNumber_KeyNotFound_ThrowsKeyNotFoundException()
    {
		// Arrange
		Dictionary<string, string> dict = new Dictionary<string, string>()
		{
			["one"] = "1",
			["two"] = "2",
			["three"] = "3"
		};
		string invalidKey = "invalid";

        // Act and Assert
        Assert.Throws<KeyNotFoundException>(() => _exceptions.GetElementAsNumber(dict, invalidKey));
	}

    [Test]
    public void Test_GetElementAsNumber_InvalidFormat_ThrowsFormatException()
    {
		// Arrange
		Dictionary<string, string> dict = new Dictionary<string, string>()
		{
			["one"] = "aa",
			["two"] = "bb",
			["three"] = "cc"
		};
		string key = "two";

        // Act and Assert
        Assert.Throws<FormatException>(() => _exceptions.GetElementAsNumber(dict, key));
	}
}
