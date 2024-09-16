using System;
using System.Collections.Generic;
using System.Linq;

namespace Ranking
{
    internal class Ranking
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> inputContestAndPassword = new Dictionary<string, string>();
            string inputCommand = string.Empty;
            while ((inputCommand = Console.ReadLine()) != "end of contests")
            {
                string contest = inputCommand.Split(":")[0];
                string password = inputCommand.Split(":")[1];
                inputContestAndPassword.Add(contest, password);
            }
            string userCommand = string.Empty;
                Dictionary<string, Candidate> candidates = new Dictionary<string, Candidate>();
            while ((userCommand = Console.ReadLine()) != "end of submissions")
            {
                string[] token = userCommand.Split("=>");
                string userContest = token[0];
                string userPassword = token[1];
                string userName = token[2];
                int points = int.Parse(token[3]);

                if (!inputContestAndPassword.ContainsKey(userContest))
                    continue;

                if (inputContestAndPassword[userContest] != userPassword)
                    continue;

                Dictionary<string, int> kVP = new Dictionary<string, int>();
                kVP.Add(userContest, points);
                Candidate candidate = new Candidate(userName, kVP);
                
                if (!candidates.ContainsKey(userName))
                    candidates.Add(userName, candidate);

                Candidate existingCandidate = candidates[userName];

                if (!existingCandidate.Contest.ContainsKey(userContest))
                    candidates[userName].Contest.Add(userContest, points);

                if (existingCandidate.Contest[userContest] < points)
                    existingCandidate.Contest[userContest] = points;
            }
            
            var bestCandidate = candidates.OrderByDescending(x => x.Value.Contest.Values.Sum()).ThenBy(x => x.Key).First();

            Console.WriteLine($"Best candidate is {bestCandidate.Key} with total {bestCandidate.Value.Contest.Values.Sum()} points.");
            Console.WriteLine("Ranking:");
            foreach (var person in candidates.OrderBy(x => x.Key))
            {
                Console.WriteLine(person.Key);
                foreach (var item in person.Value.Contest.OrderByDescending(x => x.Value))
                {
                    Console.WriteLine($"#  {item.Key} -> {item.Value}");
                }
            }


        }
    }
    class Candidate
    {
        public Candidate(string userName, Dictionary<string, int> contest)
        {
            this.UserName = userName;
            this.Contest = new Dictionary<string, int>();
        }
        public string UserName { get; set; }
        public Dictionary<string, int> Contest { get; set; }
    }
}
