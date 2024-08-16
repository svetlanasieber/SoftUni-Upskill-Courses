using System;
using System.Collections.Generic;

using NUnit.Framework;

namespace TestApp.Tests;

[TestFixture]
public class GradesTests
{
    [Test]
    public void Test_GetBestStudents_ReturnsBestThreeStudents()
    {
        // Arrange
        Dictionary<string, int> studentsWithGrades = new Dictionary<string, int>()
        {
            ["Mariika"] = 4,
            ["Pesho"] = 3,
            ["Gosho"] = 5,
            ["Doncho"] = 6,
            ["Dimitrichko"] = 2
        };
        string expected = $"Doncho with average grade 6.00{Environment.NewLine}" +
                          $"Gosho with average grade 5.00{Environment.NewLine}" +
                          $"Mariika with average grade 4.00";

        // Act 
        string actual = Grades.GetBestStudents(studentsWithGrades);

        // Assert
        Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_GetBestStudents_EmptyGrades_ReturnsEmptyString()
    {
        // Arrange
        Dictionary<string, int> studentsWithGrades = new Dictionary<string, int>();
        string expected = string.Empty;

		// Act 
		string actual = Grades.GetBestStudents(studentsWithGrades);

		// Assert
		Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_GetBestStudents_LessThanThreeStudents_ReturnsAllStudents()
    {
        // Arrange
        Dictionary<string, int> studentsWithGrades = new Dictionary<string, int>()
        {
            ["Mariika"] = 5,
            ["Pesho"] = 6
        };

        string expected = $"Pesho with average grade 6.00{Environment.NewLine}" +
                          $"Mariika with average grade 5.00";

		// Act 
		string actual = Grades.GetBestStudents(studentsWithGrades);

		// Assert
		Assert.AreEqual(expected, actual);
	}

    [Test]
    public void Test_GetBestStudents_SameGrade_ReturnsInAlphabeticalOrder()
    {
		// Arrange
		Dictionary<string, int> studentsWithGrades = new Dictionary<string, int>()
		{
			["Mariika"] = 6,
			["Pesho"] = 6,
			["Gosho"] = 6,
			["Doncho"] = 6,
			["Dimitrichko"] = 6
		};

		string expected = $"Dimitrichko with average grade 6.00{Environment.NewLine}" +
						  $"Doncho with average grade 6.00{Environment.NewLine}" +
						  $"Gosho with average grade 6.00";

		// Act 
		string actual = Grades.GetBestStudents(studentsWithGrades);

		// Assert
		Assert.AreEqual(expected, actual);
	}
}
