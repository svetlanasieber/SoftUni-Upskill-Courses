using NUnit.Framework;

using System;

using TestApp.Vehicle;

namespace TestApp.UnitTests;

public class VehicleTests
{
    private Vehicles vehicles;

    [SetUp]
    public void SetUp()
    {
        vehicles = new Vehicles();
    }

    [Test]
    public void Test_AddAndGetCatalogue_ReturnsSortedCatalogue()
    {
        // Arrange
        string[] input =
        {
            "Car/Ford/Focus/120",
            "Car/Toyota/Camry/150",
            "Truck/Volvo/VNL/500",
        };
       
        string expected = $"Cars:{Environment.NewLine}Ford: Focus - 120hp{Environment.NewLine}Toyota: Camry - 150hp{Environment.NewLine}Trucks:{Environment.NewLine}Volvo: VNL - 500kg";

        // Act
        string result = this.vehicles.AddAndGetCatalogue(input);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_AddAndGetCatalogue_ReturnsEmptyCatalogue_WhenNoDataGiven()
    {
        //Arrange
        string expected = $"Cars:{Environment.NewLine}" + "Trucks:";

        //Act
        string result = vehicles.AddAndGetCatalogue(Array.Empty<string>());

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }
}
