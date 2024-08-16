using NUnit.Framework;

using System;
using System.Collections.Generic;

namespace TestApp.UnitTests;

public class PersonTests
{
    //тестове за клас Person
    private Person person; //помощен обект -> изпълняваме методите в класа

    [SetUp]
    public void SetUp()
    {
        person = new(); //нов празен обект от клас Person
    }

    
    [Test]
    public void Test_AddPeople_ReturnsListWithUniquePeople()
    {
        // Arrange
        string[] peopleData =
        {
            "Alice A001 25",
            "Bob B002 30",
            "Alice A001 35"
        };

        List<Person> expectedPeopleList = new List<Person>()
        {
            new Person()
            {
                Name = "Alice",
                Id = "A001",
                Age = 35
            },
            new Person ()
            {
                Name = "Bob",
                Id = "B002",
                Age = 30
            }
        };

        // Act
        List<Person> resultPeopleList = person.AddPeople(peopleData);

        // Assert
        Assert.That(resultPeopleList, Has.Count.EqualTo(expectedPeopleList.Count));

        //сигурни сме, че в двата списъка има еднакъв брой елементи
        for (int position = 0; position <= resultPeopleList.Count - 1; position++)
        {
           Person expectedPerson = expectedPeopleList[position]; //очакван човек
           Person realPerson = resultPeopleList[position]; //реалния човек

            //сравняваме характеристиките на очаквания обект спрямо реалния обект
           Assert.That(realPerson.Name, Is.EqualTo(expectedPerson.Name));
           Assert.That(realPerson.Id, Is.EqualTo(expectedPerson.Id));
           Assert.That(realPerson.Age, Is.EqualTo(expectedPerson.Age));
        }
    }

    [Test]
    public void Test_GetByAgeAscending_SortsPeopleByAge()
    {
        //Arrange
        List<Person> people = new List<Person>()
        {
            new Person()
            {
                Name = "Alice",
                Id = "A001",
                Age = 35
            },
            new Person ()
            {
                Name = "Bob",
                Id = "B002",
                Age = 30
            }
        };

        string expected = "Bob with ID: B002 is 30 years old."
                          + Environment.NewLine
                          + "Alice with ID: A001 is 35 years old.";

        //Act
        string result = person.GetByAgeAscending(people);

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }
}
