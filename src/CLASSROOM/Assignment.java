package CLASSROOM;

public class Assignment {

    public boolean isHomework;

    public String name;
    public double grade;

    public double getGrade() {
        return grade;
    }


    public Assignment(String name, double grade, boolean isHomework) {
        this.name = name;
        this.grade = grade;
        this.isHomework = isHomework;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Is Homework: " + (isHomework ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment("Math Homework", 95.5, true);
        assignment.print();
    }
}
