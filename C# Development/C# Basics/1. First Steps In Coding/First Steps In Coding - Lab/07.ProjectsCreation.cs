string nameOfArchitecture = Console.ReadLine();
int projectsCount = int.Parse(Console.ReadLine());

int neededHours = projectsCount * 3;

Console.WriteLine($"The architect {nameOfArchitecture} will need {neededHours} hours to complete {projectsCount} project/s.");
