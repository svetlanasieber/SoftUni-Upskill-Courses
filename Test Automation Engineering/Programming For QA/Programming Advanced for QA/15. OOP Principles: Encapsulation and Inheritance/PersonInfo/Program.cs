using PersonInfo; //дефинираме, че искаме да използваме всички класове в namespace

using System;
using System.Collections.Generic;
using System.Linq;

int lines = byte.Parse(Console.ReadLine());

List<Person> persons = new List<Person>(); //празен списък с обекти от клас Person
for (int line = 1; line <= lines; line++)
{
    string[] cmd = Console.ReadLine()!.Split(); //"{firstName} {lastName} {age}"
    string firstName = cmd[0];
    string lastName = cmd[1];
    int age = int.Parse(cmd[2]);

    Person person = new Person(firstName, lastName, age);
    persons.Add(person);
}

persons
    .OrderBy(p => p.FirstName) //сортираме обектите по име в нараставащ (азбучен) ред
    .ThenBy(p => p.Age)         //сортираме обектите по възраст в нарастващ ред
    .ToList()
    .ForEach(Console.WriteLine);


