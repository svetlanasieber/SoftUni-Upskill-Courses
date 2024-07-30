
string[] articleInfo = Console.ReadLine().Split(", ");

string title = articleInfo[0];
string content = articleInfo[1];
string author = articleInfo[2];

Article article = new Article(title, content, author);

int n = int.Parse(Console.ReadLine());

for (int i = 0; i < n; i++)
{
	string[] input = Console.ReadLine().Split(": ");

	string command = input[0];
	string newData = input[1];

	switch (command)
	{
		case "Edit":
			article.Edit(newData);
			break;
		case "ChangeAuthor":
			article.ChangeAuthor(newData);
			break;
		case "Rename":
			article.Rename(newData);
			break;
	}
}

Console.WriteLine(article.ToString());

class Article
{
	public Article(string title, string content, string author)
	{
		Title = title;
		Content = content;
		Author = author;
	}

	public string Title { get; private set; }

    public string Content { get; private set; }

    public string Author { get; private set; }

	public void Edit(string newContent)
	{
		Content = newContent;
	}
	
	public void ChangeAuthor(string newAuthor)
	{
		Author = newAuthor;
	}

	public void Rename(string newTitle)
	{
		Title = newTitle;
	}

	public override string ToString()
	{
		return $"{Title} - {Content}: {Author}";
	}
}
