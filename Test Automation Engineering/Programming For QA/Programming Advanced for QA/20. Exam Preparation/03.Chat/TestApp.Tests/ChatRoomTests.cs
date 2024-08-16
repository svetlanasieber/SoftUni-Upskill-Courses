using System;

using NUnit.Framework;

using TestApp.Chat;

namespace TestApp.Tests;

[TestFixture]
public class ChatRoomTests
{
    private ChatRoom _chatRoom = null!;
    
    [SetUp]
    public void Setup()
    {
        this._chatRoom = new();
    }
    
    [Test]
    public void Test_SendMessage_MessageSentToChatRoom()
    {
        // Arrange
        string sender = "Diyan";
        string message = "Hello!";
        string expectedDate = DateTime.Now.Date.ToString("d");

        string expected = $"Chat Room Messages:{Environment.NewLine}Diyan: Hello! - Sent at {expectedDate}";

		// Act
		_chatRoom.SendMessage(sender, message);
        string actual = _chatRoom.DisplayChat();

        // Assert
        Assert.AreEqual(expected, actual);  
    }

    [Test]
    public void Test_DisplayChat_NoMessages_ReturnsEmptyString()
    {
        // Arrange
        string expected = string.Empty;

        // Act
        string actual = _chatRoom.DisplayChat();

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [Test]
    public void Test_DisplayChat_WithMessages_ReturnsFormattedChat()
    {
		// Arrange
		string expectedDate = DateTime.Now.Date.ToString("d");

        string expected = $"Chat Room Messages:{Environment.NewLine}" +
                        $"Pesho: Hello! - Sent at {expectedDate}{Environment.NewLine}" +
                        $"Gosho: My name is Gosho. - Sent at {expectedDate}{Environment.NewLine}" +
                        $"Mariika: Good buy. - Sent at {expectedDate}";

		// Act
		_chatRoom.SendMessage("Pesho", "Hello!");
        _chatRoom.SendMessage("Gosho", "My name is Gosho.");
        _chatRoom.SendMessage("Mariika", "Good buy.");

        string actual = _chatRoom.DisplayChat();

        // Assert
        Assert.AreEqual(expected, actual);
	}

}
