package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repository;

    public StudentSystem() {
        this.repository = new HashMap<>();

    }

    public void parseCommand(String[] data) {
        if (data[0].equals("Create")) {
            create(data);
        } else if (data[0].equals("Show")) {
            show(data);
        }
    }

    public void show(String[] data) {
        String name = data[1];
        if (repository.containsKey(name)) {
            Student student = repository.get(name);
            String view = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                view += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }
            System.out.println(view);
        }
    }

    public void create(String[] data) {
        String name = data[1];
        int age = Integer.parseInt(data[2]);
        double grade = Double.parseDouble(data[3]);
        if (!this.repository.containsKey(name)) {
            Student student = new Student(name, age, grade);
            this.repository.put(name, student);
        }
    }
}
