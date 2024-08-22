string studentName = Console.ReadLine();
int age = int.Parse(Console.ReadLine());
double averageGrade = double.Parse(Console.ReadLine());

//"Name: {student name}, Age: {student age}, Grade: {student grade}".
Console.WriteLine($"Name: {studentName}, Age: {age}, Grade: {averageGrade:F2}");
