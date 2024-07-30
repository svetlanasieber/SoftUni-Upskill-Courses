using _03.TeamworkProjects;
using System.Text;

int n = int.Parse(Console.ReadLine());

List<Team> teams = new List<Team>();

for (int i = 0; i < n; i++)
{
	string[] teamInfo = Console.ReadLine().Split("-");
	string creatorName = teamInfo[0];
	string teamName = teamInfo[1];

	if (teams.Any(t => t.Name == teamName))
	{
        Console.WriteLine($"Team {teamName} was already created!");
    }
	else if (teams.Any(t => t.Creator == creatorName))
	{
        Console.WriteLine($"{creatorName} cannot create another team!");
	}
	else
	{
		Team team = new Team(teamName, creatorName);

		teams.Add(team);

        Console.WriteLine($"Team {teamName} has been created by {creatorName}!");
    }
}

while (true)
{
	string[] input = Console.ReadLine().Split("->");

	string userName = input[0];

	if (userName == "end of assignment")
		break;

	string teamName = input[1];

	if (!teams.Any(t => t.Name == teamName))
	{
        Console.WriteLine($"Team {teamName} does not exist!");	
	}
	else if (teams.Any(t => t.Members.Contains(userName) ||
		   	 teams.Any(t => t.Creator == userName)))
	{
        Console.WriteLine($"Member {userName} cannot join team {teamName}!");
    }
	else
	{
		Team team = teams.First(t => t.Name == teamName);
		team.Members.Add(userName);
    }
}

List<Team> validTeams = teams.Where(t => t.Members.Count > 0).ToList();
List<Team> disbandTeams = teams.Where(t => t.Members.Count == 0).ToList();

foreach (var team in validTeams.OrderByDescending(t => t.Members.Count)
								.ThenBy(t => t.Name))
{
	StringBuilder sb = new StringBuilder();
	
	sb.AppendLine(team.Name);
	sb.AppendLine($"- {team.Creator}");

    foreach (var member in team.Members.OrderBy(m => m))
    {
		sb.AppendLine($"-- {member}");
    }

    Console.WriteLine(sb.ToString().Trim());
}

Console.WriteLine("Teams to disband:");	

foreach (var team in disbandTeams.OrderBy(t => t.Name))
{
    Console.WriteLine(team.Name);
}
