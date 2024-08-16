using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class SongTests
{

    private Song song; //помощен обект => всеки един тест се характеризира (може да работи) с обект от класа Songs

    [SetUp]
    public void Setup()
    {
        this.song = new(); //нов празен обект преди изпълнението на всеки тест
        //song
        //name = null
        //time = null
        //listType = null
    }

    [Test]
    public void Test_AddAndListSongs_ReturnsAllSongs_WhenWantedListIsAll()
    {
        //помощен обект song -> чрез него изпълняваме методи от класа
        // Arrange
        string[] songs = {
            "Pop_Song1_3:30",
            "Rock_Song2_4:15",
            "Pop_Song3_3:00"
        };
        string playlist = "all";
        string expected = $"Song1{Environment.NewLine}Song2{Environment.NewLine}Song3";

        // Act
        string result = song.AddAndListSongs(songs, playlist);

        // Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_AddAndListSongs_ReturnsFilteredSongs_WhenWantedListIsSpecific()
    {
        //помощен обект song -> чрез него изпълняваме методи от класа
        //Аrrange
        string[] songs = {
            "Pop_Song1_3:30",
            "Rock_Song2_4:15",
            "Pop_Song3_3:00"
        };
        string playlist = "Pop";
        string expected = $"Song1{Environment.NewLine}Song3";

        //Act
        string result = song.AddAndListSongs(songs, playlist);

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }

    [Test]
    public void Test_AddAndListSongs_ReturnsEmptyString_WhenNoSongsMatchWantedList()
    {
        //Arrange
        string[] songs = {
            "Pop_Song1_3:30",
            "Rock_Song2_4:15",
            "Pop_Song3_3:00"
        };
        string playlist = "Jazz";
        string expected = string.Empty;

        //Act
        string result = song.AddAndListSongs(songs, playlist);

        //Assert
        Assert.That(result, Is.EqualTo(expected));
    }
}
