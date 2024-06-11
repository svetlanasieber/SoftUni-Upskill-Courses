string architectureName = Console.ReadLine();
int countOfProjectsForCreation = int.Parse(Console.ReadLine());

//one project creation takes 3 hours

int needHours = countOfProjectsForCreation * 3;
Console.WriteLine($"The architect {architectureName} will need {needHours} hours to complete {countOfProjectsForCreation} project/s.");
