using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class ArticleTests
{
    private Article article;

    [SetUp]
    public void SetUp()
    {
        article = new Article();
    }

    [Test]
    public void Test_AddArticles_ReturnsArticleWithCorrectData()
    {
        // Arrange
        string[] input =
       {
            "Article Content Author",
            "Article2 Content2 Author2",
            "Article3 Content3 Author3"
        };

        // Act
        Article resultArticle = article.AddArticles(input);

        // Assert
        Assert.That(resultArticle.ArticleList, Has.Count.EqualTo(3));
        Assert.That(resultArticle.ArticleList[0].Title, Is.EqualTo("Article"));
        Assert.That(resultArticle.ArticleList[1].Content, Is.EqualTo("Content2"));
        Assert.That(resultArticle.ArticleList[2].Author, Is.EqualTo("Author3"));
    }

    [Test]
    public void Test_GetArticleList_SortsArticlesByTitle()
    {
        //Arrange
        string[] input =
       {
            "UArticle Content Author",
            "Article2 Content2 Author2",
            "BArticle3 Content3 Author3"
        };

        string expected = $"Article2 - Content2: Author2{Environment.NewLine}" +
            $"BArticle3 - Content3: Author3{Environment.NewLine}" +
            $"UArticle - Content: Author";

        //Act
        Article resultArticle = article.AddArticles(input);
        string output = article.GetArticleList(resultArticle, "title");

        //Assert
        Assert.That(output, Is.EqualTo(expected));
    }

    [Test]
    public void Test_GetArticleList_ReturnsEmptyString_WhenInvalidPrintCriteria()
    {
        //Arrange
        string[] input =
       {
            "UArticle Content Author",
            "Article2 Content2 Author2",
            "BArticle3 Content3 Author3"
        };

        //Act
        Article resultArticle = article.AddArticles(input);
        string output = article.GetArticleList(resultArticle, "article");

        //Assert
        Assert.That(output, Is.EqualTo(string.Empty));
    }
}
