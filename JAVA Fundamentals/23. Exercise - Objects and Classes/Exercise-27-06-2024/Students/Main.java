import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= countStudents; count++) {
            String personalData = scanner.nextLine();
          
            String[] splitData = personalData.split(" ");
            String firstName = splitData[0];
            String lastName = splitData[1];
            double grade = Double.parseDouble(splitData[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        
        studentList
                .sort(Comparator.comparingDouble(Student::getGrade) 
                .reversed()); //descending order

       
        for (Student student : studentList) {
            
            System.out.println(student.toString());
        }
    }
}
