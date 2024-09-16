using System;
using System.Collections.Generic;
using System.Linq;

namespace TheVLogger
{
    internal class TheVLogger
    {
        static void Main(string[] args)
        {
            string command = string.Empty;
            HashSet<Vlogger> vloggers = new HashSet<Vlogger>();
            while ((command = Console.ReadLine()) != "Statistics")
            {
                HashSet<string> followers = new HashSet<string>();
                HashSet<string> following = new HashSet<string>();
                string vloggerName = command.Split()[0];
                string action = command.Split()[1];
                if (action == "joined")
                {
                    Vlogger currentVlogger = new Vlogger(vloggerName, followers, following);
                    currentVlogger.Name = vloggerName;
                    currentVlogger.Followers = followers;
                    currentVlogger.Following = following;
                    if (!vloggers.Any(x => x.Name == vloggerName))
                        vloggers.Add(currentVlogger);
                }
                else if (action == "followed")
                {
                    string follow = command.Split()[2];
                    if (vloggerName == follow)
                    {
                        continue;
                    }
                    if (!(vloggers.Any(x => x.Name == follow)))
                        continue;
                    if (!(vloggers.Any(x => x.Name == vloggerName)))
                        continue;
                    Vlogger vlogger1 = vloggers.FirstOrDefault(x => x.Name == follow);
                    Vlogger vlogger2 = vloggers.FirstOrDefault(x => x.Name == vloggerName);
                    if (vlogger1 != null)
                        vlogger1.Followers.Add(vloggerName);
                    if (vlogger2 != null)
                        vlogger2.Following.Add(follow);
                }
            }
            Console.WriteLine($"The V-Logger has a total of {vloggers.Count} vloggers in its logs.");
            var famousVlogger = vloggers.OrderByDescending(x => x.Followers.Count()).ThenBy(x => x.Following.Count()).First();
            if (famousVlogger.Followers.Count > 0)
            {
                Console.WriteLine($"1. {famousVlogger.Name} : {famousVlogger.Followers.Count} followers, {famousVlogger.Following.Count} following");
                foreach (var follower in famousVlogger.Followers.OrderBy(x => x))
                {
                    Console.WriteLine($"*  {follower}");
                }
                vloggers.Remove(famousVlogger);
                int counter = 2;
                foreach (var vlogger in vloggers.OrderByDescending(x => x.Followers.Count()).ThenBy(x => x.Following.Count()))
                {
                    Console.WriteLine($"{counter}. {vlogger.Name} : {vlogger.Followers.Count} followers, {vlogger.Following.Count} following");
                    counter++;
                }
            }
        }
    }
    class Vlogger
    {
        public Vlogger(string name, HashSet<string> folowers, HashSet<string> folowing)
        {
            this.Name = name;
            this.Followers = new HashSet<string>();
            this.Following = new HashSet<string>();
        }
        public string Name { get; set; }
        public HashSet<string> Followers { get; set; }
        public HashSet<string> Following { get; set; }
    }
}
