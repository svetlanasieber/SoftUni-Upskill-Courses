int n = int.Parse(Console.ReadLine());
List<Student> students = new List<Student>();

for (int i = 0; i < n; i++)
{
	string[] input = Console.ReadLine().Split();

	Student student = new Student(input[0], input[1], double.Parse(input[2]));

	students.Add(student);
}

foreach (var currentStudent in students.OrderByDescending(s => s.Grade))
{
    Console.WriteLine($"{currentStudent.FirstName} {currentStudent.LastName}: {currentStudent.Grade:F2}");
}

class Student
{
    public Student(string firstName, string lastName, double grade)
	{
		FirstName = firstName;
		LastName = lastName;
		Grade = grade;
	}

	public string FirstName { get; set; }

	public string LastName { get; set; }

	public double Grade { get; set; }
}
