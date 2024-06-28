namespace FootballTeamGenerator;

using System;

public class Player
{
    private const int MinStat = 0;
    private const int MaxStat = 100;
    
    public Player(string name, int endurance, int sprint, int dribble, int passing, int shooting)
    {
        if (string.IsNullOrWhiteSpace(name)) throw new ArgumentException("A name should not be empty.");
        if (endurance < MinStat || endurance > MaxStat) throw new ArgumentException(PrepareStatExceptionMessage("Endurance"));
        if (sprint < MinStat || sprint > MaxStat) throw new ArgumentException(PrepareStatExceptionMessage("Sprint"));
        if (dribble < MinStat || dribble > MaxStat) throw new ArgumentException(PrepareStatExceptionMessage("Dribble"));
        if (passing < MinStat || passing > MaxStat) throw new ArgumentException(PrepareStatExceptionMessage("Passing"));
        if (shooting < MinStat || shooting > MaxStat) throw new ArgumentException(PrepareStatExceptionMessage("Shooting"));
        
        this.Name = name;
        this.Endurance = endurance;
        this.Sprint = sprint;
        this.Dribble = dribble;
        this.Passing = passing;
        this.Shooting = shooting;
    }

    public string Name { get; }
    public int Endurance { get; }
    public int Sprint { get; }
    public int Dribble { get; }
    public int Passing { get; }
    public int Shooting { get; }
    public double SkillLevel => (this.Endurance + this.Sprint + this.Dribble + this.Passing + this.Shooting) / 5.0;

    private static string PrepareStatExceptionMessage(string stat) => $"{stat} should be between {MinStat} and {MaxStat}.";
}

/* JAVA Version

    public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    private void validate(int skillAmount, String skill) {
        if (skillAmount < 0 || skillAmount > 100) {
            throw new IllegalArgumentException(skill + ExceptionMessages.INVALID_SKILL_AMOUNT);
        }
    }

    private void setEndurance(int endurance) {
        validate(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validate(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validate(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validate(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validate(shooting,"Shooting");
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting)/5.00;
    }
}
*/
