string[] usernames = Console.ReadLine().Split(", ");

foreach (string username in usernames)
{
	if (username.Length < 3 || username.Length > 16)
	{
		continue;

	}

	bool isValidName = username.All(symbol => char.IsLetterOrDigit(symbol) ||
											  symbol == '-' ||
											  symbol == '_');	
	if (isValidName)
	{
        Console.WriteLine(username);
    }
}
