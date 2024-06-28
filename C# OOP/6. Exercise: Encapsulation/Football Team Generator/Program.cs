namespace FootballTeamGenerator;

using System;
using System.Collections.Generic;

public static class Program
{
    static void Main(string[] args)
    {
        var teams = new Dictionary<string, Team>();

        var input = Console.ReadLine();
        while (input != "END")
        {
            var data = input.Split(';');

            var command = data[0];
            var teamName = data[1];

            try
            {
                if (command == "Team") teams[teamName] = new Team(teamName);
                else if (!teams.TryGetValue(teamName, out var team)) Console.WriteLine($"Team {teamName} does not exist.");
                else if (command == "Rating") Console.WriteLine($"{team.Name} - {team.Rating}");
                else if (command == "Add")
                {
                    var player = new Player(data[2], int.Parse(data[3]), int.Parse(data[4]), int.Parse(data[5]), int.Parse(data[6]), int.Parse(data[7]));
                    team.AddPlayer(player);
                }
                else if (command == "Remove")
                {
                    var playerName = data[2];
                    if (!team.RemovePlayer(playerName)) Console.WriteLine($"Player {playerName} is not in {team.Name} team.");
                }
            }
            catch (ArgumentException e)
            {
                Console.WriteLine(e.Message);
            }

            input = Console.ReadLine();
        }
    }
}

/* Java 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static String[] input = null;
    private static Team tempTeam;
    private static Map<String, Team> teams = new HashMap<>();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        readCommand(console);

        while (!"END".equals(input[0])) {
            try {
                executeCommand();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            readCommand(console);
        }
    }

    private static void executeCommand() {
        String command = input[0];
        String teamName = input[1];

        switch (command) {
            case "Team":
                createTeam(teamName);
                break;

            case "Add":
                addPlayer(teamName);
                break;

            case "Remove":
                removePlayer(teamName);
                break;

            case "Rating":
                showRating(teamName);
                break;
        }
    }

    private static void showRating(String teamName) {
        //"Rating;{TeamName}" – print the team rating, rounded to the closest integer
        tempTeam = getTeam(teamName);
        System.out.printf("%s - %.0f%n", teamName, tempTeam.getRating());
    }

    private static void removePlayer(String teamName) {
        //"Remove;{TeamName};{PlayerName}" – remove the player from the team
        String playerName = input[2];
        if(teams.containsKey(teamName)) {
            tempTeam = getTeam(teamName);
            tempTeam.removePlayer(playerName);
        }
    }

    private static void addPlayer(String teamName) {
        //"Add;{TeamName};{PlayerName};{Endurance};{Sprint};{Dribble};{Passing};{Shooting}" – add a new player to the team
        tempTeam = getTeam(teamName);

        String playerName = input[2];
        int endurance = Integer.parseInt(input[3]);
        int sprint = Integer.parseInt(input[4]);
        int dribble = Integer.parseInt(input[5]);
        int passing = Integer.parseInt(input[6]);
        int shooting = Integer.parseInt(input[7]);

        Player newPlayer = new Player(playerName, endurance, sprint, dribble, passing, shooting);
        tempTeam.addPlayer(newPlayer);
    }

    private static Team getTeam(String teamName) {
        if (teams.containsKey(teamName)) {
            return teams.get(teamName);
        } else {
            String message = String.format(ExceptionMessages.NO_SUCH_TEAM, teamName);
            throw new IllegalArgumentException(message);
        }
    }

    private static void createTeam(String teamName) {
        //"Team;{TeamName}" – add a new team
        Team newTeam = new Team(teamName);
        teams.put(teamName, newTeam);
    }

    private static void readCommand(Scanner console) {
        input = console.nextLine().split(";");
    }
}
*/
