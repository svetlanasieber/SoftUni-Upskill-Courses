package StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }

    public double getGrade() {
        return this.grade;
    }
}
