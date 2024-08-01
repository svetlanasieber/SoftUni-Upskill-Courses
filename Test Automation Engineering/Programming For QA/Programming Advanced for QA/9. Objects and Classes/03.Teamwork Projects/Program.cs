
Dictionary<string, Team> teams = new Dictionary<string, Team>();


List<string> teamsToDisband = new List<string>();


int n = int.Parse(Console.ReadLine());


for (int i = 0; i < n; i++)
{
    string[] input = Console.ReadLine().Split('-');
    string creator = input[0];
    string teamName = input[1];

    
    if (teams.ContainsKey(teamName))
    {
        Console.WriteLine($"Team {teamName} was already created!");
        continue;
    }
    else if (teams.Any(t => t.Value.Creator == creator))
    {
        Console.WriteLine($"{creator} cannot create another team!");
        continue;
    }

    
    teams.Add(teamName, new Team(teamName, creator));
    Console.WriteLine($"Team {teamName} has been created by {creator}!");
}


string command;
while ((command = Console.ReadLine()) != "end of assignment")
{
    string[] input = command.Split("->");
    string user = input[0];
    string teamName = input[1];


    if (!teams.ContainsKey(teamName))
    {
        Console.WriteLine($"Team {teamName} does not exist!");
        continue;
    }

   
    if (teams.Any(t => t.Value.Members.Contains(user) || t.Value.Creator == user))
    {
        Console.WriteLine($"Member {user} cannot join team {teamName}!");
        continue;
    }

 
    teams[teamName].Members.Add(user);
}


foreach (var team in teams.Where(t => t.Value.Members.Count == 0).OrderBy(t => t.Key))
{
    teamsToDisband.Add(team.Key);
}


foreach (var team in teams.Where(t => t.Value.Members.Count > 0).OrderByDescending(t => t.Value.Members.Count).ThenBy(t => t.Key))
{
    Console.WriteLine($"{team.Key}");
    Console.WriteLine($"- {team.Value.Creator}");
    foreach (var member in team.Value.Members.OrderBy(m => m))
    {
        Console.WriteLine($"-- {member}");
    }
}

// Print teams to disband
Console.WriteLine("Teams to disband:");
foreach (var team in teamsToDisband)
{
    Console.WriteLine($"{team}");
}
