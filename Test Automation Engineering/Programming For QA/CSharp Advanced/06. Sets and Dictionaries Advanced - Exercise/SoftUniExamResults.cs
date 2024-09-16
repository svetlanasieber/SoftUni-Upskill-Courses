using System;
using System.Collections.Generic;
using System.Linq;

namespace SoftUniExamResults
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, Dictionary<string, int>> participant = new Dictionary<string, Dictionary<string, int>>();
            Dictionary<string, int> submissions = new Dictionary<string, int>();
            string command = string.Empty;
            while ((command = Console.ReadLine()) != "exam finished")
            {
                string[] cmdArg = command.Split("-");
                string username = cmdArg[0];
                string languageOrBanned = cmdArg[1];
                if (languageOrBanned == "banned")
                {
                    participant.Remove(username);
                    continue;
                }
                int points = int.Parse(cmdArg[2]);
                if (!participant.ContainsKey(username))
                    participant.Add(username, new Dictionary<string, int>());

                if (!participant[username].ContainsKey(languageOrBanned))
                    participant[username].Add(languageOrBanned, points);

                if (participant[username][languageOrBanned] < points)
                    participant[username][languageOrBanned] = points;

                if (!submissions.ContainsKey(languageOrBanned))
                    submissions.Add(languageOrBanned, 1);
                else
                    submissions[languageOrBanned]++;
            }
            Console.WriteLine("Results:");
            foreach (var item in participant.OrderByDescending(r => r.Value.Sum(y => y.Value)).ThenBy(x => x.Key))
            {
                Console.WriteLine($"{item.Key} | {item.Value.Values.Sum()}");
            }
            Console.WriteLine("Submissions:");
            foreach (var item in submissions.OrderByDescending(x => x.Value).ThenBy(x => x.Key))
            {
                Console.WriteLine($"{item.Key} - {item.Value}");
            }
        }
    }
}
