using System;

using NUnit.Framework;

using TestApp.Todo;

namespace TestApp.Tests;

[TestFixture]
public class ToDoListTests
{
    private ToDoList _toDoList = null;
    
    [SetUp]
    public void SetUp()
    {
        this._toDoList = new();
    }
    
    [Test]
    public void Test_AddTask_TaskAddedToToDoList()
    {
        //Arrange
        string taskName = "First Task";
        DateTime dueDate = DateTime.Parse("01.01.2025");

        string expectedTextForAddedTask = "[ ] First Task - Due: 01/01/2025";
        //Act
        //празен списък със задачи
        _toDoList.AddTask(taskName, dueDate); //добавяме задача в списъка
        //списък с 1 задача: "First Task", 01.01.2025, complete = false
        string result = _toDoList.DisplayTasks(); //получавам всички задачи в списъка

        //Assert
        Assert.That(result.Contains(expectedTextForAddedTask), Is.True);

    }

    [Test]
    public void Test_CompleteTask_TaskMarkedAsCompleted()
    {
        //Аrrange
        string taskName = "First Task";
        DateTime dueDate = DateTime.Parse("01.01.2025");
        string expectedTextForAddedAndCompletedTask = "[✓] First Task - Due: 01/01/2025";

        //Act
        //добавяме задачата в списъка
        _toDoList.AddTask(taskName, dueDate);
        //списък с 1 задача: "First Task", 01.01.2025, complete = false

        //променяме завършеността на задачата
        _toDoList.CompleteTask(taskName);
        //списък с 1 задача: "First Task", 01.01.2025, complete = true

        string result = _toDoList.DisplayTasks(); //получавам всички задачи в списъка

        //Assert
        Assert.That(result.Contains(expectedTextForAddedAndCompletedTask), Is.True);
    }

    [Test]
    public void Test_CompleteTask_TaskNotFound_ThrowsArgumentException()
    {
        //Arrange
        string taskName = "First Task";
        DateTime dueDate = DateTime.Parse("01.01.2025");

        //Act
        //добавяме задачата в списъка
        _toDoList.AddTask(taskName, dueDate);
        //списък с 1 задача: "First Task", 01.01.2025, complete = false

        //Assert
        Assert.That(() => _toDoList.CompleteTask("Clean"), Throws.ArgumentException);
    }

    [Test]
    public void Test_DisplayTasks_NoTasks_ReturnsEmptyString()
    {
        //Arrange
        string expected = "To-Do List:";

        //Act
        //празен списък със задачи
        string result = _toDoList.DisplayTasks();

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_DisplayTasks_WithTasks_ReturnsFormattedToDoList()
    {
        //Arrange
        string firstTaskName = "First Task";
        DateTime firstTaskDueDate = DateTime.Parse("01.01.2025");

        string secondTaskName = "Second Task";
        DateTime secondTaskDueDate = DateTime.Parse("02.02.2025");

        string expected = "To-Do List:" + System.Environment.NewLine
            + "[✓] First Task - Due: 01/01/2025" + System.Environment.NewLine
            + "[ ] Second Task - Due: 02/02/2025";

        //Act
        //празен списък със задачи

        _toDoList.AddTask(firstTaskName, firstTaskDueDate); //добавяме първата задача в списъка
        //списък с 1 задача: "First Task", 01.01.2025, complete = false

        _toDoList.AddTask(secondTaskName, secondTaskDueDate); //добавяме първата задача в списъка
        //списък с 2 задачи:
        //"First Task", 01.01.2025, complete = false
        //"Second Task", 02.02.2025, complete = false

        _toDoList.CompleteTask(firstTaskName);
        //списък с 2 задачи:
        //"First Task", 01.01.2025, complete = true
        //"Second Task", 02.02.2025, complete = false

        string result = _toDoList.DisplayTasks(); //получавам всички задачи в списъка

        //Assert
        Assert.That(result, Is.EqualTo(expected));
        
    }
}
