using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class StudentTests
{
    //тестове върху класа Student -> характеризират с обект от класа Student
    private Student student; //_ -> обект, който се използва във всеки клас / помощен обект

    [SetUp] //set up метод => изпълнява се преди всеки един [Test]
    public void SetUp()
    {
        //в теста да мога да работя с обект от класа Student, който е празен
        this.student = new(); //_student = нов празен обект
        //firstName = null
        //lastName = null
        //age = 0 
        //homeTown = null
    }

    [Test]
    public void Test_AddAndGetByCity_ReturnsStudentsInCity_WhenCityExists()
    {
        // Arrange
        string[] students = { "John Doe 25 Sofia", "Jane Smith 22 Varna", "Alice Johnson 20 Sofia" };
        string expected = $"John Doe is 25 years old.{Environment.NewLine}Alice Johnson is 20 years old.";

        // Act
        string result = student.AddAndGetByCity(students, "Sofia");

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_AddAndGetByCity_ReturnsEmptyString_WhenCityDoesNotExist()
    {
        //Arrange
        string[] students = {
            "John Doe 25 Sofia",
            "Jane Smith 22 Varna",
            "Alice Johnson 20 Sofia"
        };

        //Act
        string result = student.AddAndGetByCity(students, "Plovdiv");

        //Assert
        Assert.That(result, Is.EqualTo(string.Empty));
    }

    [Test]
    public void Test_AddAndGetByCity_ReturnsEmptyString_WhenNoStudentsGiven()
    {
        //Arrange
        string[] students = Array.Empty<string>();

        //Act
        string result = student.AddAndGetByCity(students, "Sofia");

        //Assert
        Assert.That(result, Is.EqualTo(string.Empty));
    }
}
