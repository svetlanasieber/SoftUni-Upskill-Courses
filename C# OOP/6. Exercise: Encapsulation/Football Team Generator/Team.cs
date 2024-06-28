namespace FootballTeamGenerator;

using System;
using System.Collections.Generic;
using System.Linq;

public class Team
{
    private readonly Dictionary<string, Player> _players = new();

    public Team(string name)
    {
        if (string.IsNullOrWhiteSpace(name)) throw new ArgumentException("A name should not be empty.");
        this.Name = name;
    }
    
    public string Name { get; }
    public int Rating => this.CalculateRating();

    public bool AddPlayer(Player player) => this._players.TryAdd(player.Name, player);

    public bool RemovePlayer(string playerName) => this._players.Remove(playerName);

    private int CalculateRating()
    {
        if (this._players.Count == 0) return 0;
        return (int) Math.Round(this._players.Average(x => x.Value.SkillLevel));
    }
}

/* Java Version
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String name) {
        if (!players.removeIf(s -> s.getName().equals(name))) {
            String message = String.format(ExceptionMessages.NO_SUCH_PLAYER, name, this.name);
            throw new IllegalArgumentException(message);
        }
    }

    public double getRating() {
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}
*/
