using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class PlanetTests
{
    private Planet planet; //нека всички тестове използват обект от класа Planet

    [SetUp]
    public void SetUp() //преди изпълнението на всеки един тест
    {
        planet = new Planet("Earth", 12742, 149600000, 1);
        //object planet
        //name: "Earth"
        //diameter: 12742
        //distanceFromSun: 149600000
        //countMoons: 1
    }


    [Test]
    public void Test_CalculateGravity_ReturnsCorrectCalculation()
    {
        // Arrange
        double mass = 1000; //маса на планетат
        double radius = planet.Diameter / 2; //радиус на планетата
        double expectedGravity = mass * 6.67430e-11 / Math.Pow(radius, 2);

        // Act
        double actualGravity = planet.CalculateGravity(mass);

        // Assert
        Assert.That(actualGravity, Is.EqualTo(expectedGravity));
    }

    [Test]
    public void Test_GetPlanetInfo_ReturnsCorrectInfo()
    {
        //Аrrange
        string expectedInfo = $"Planet: {planet.Name}"
                            + Environment.NewLine 
                            + $"Diameter: {planet.Diameter} km"
                            + Environment.NewLine
                            + $"Distance from the Sun: {planet.DistanceFromSun} km"
                            + Environment.NewLine
                            + $"Number of Moons: {planet.NumberOfMoons}";

        //Act
        string resultInfo = planet.GetPlanetInfo();

        //Assert
        Assert.That(resultInfo, Is.EqualTo(expectedInfo));

    }
}
