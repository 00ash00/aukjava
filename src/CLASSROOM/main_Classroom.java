package CLASSROOM;

import java.util.ArrayList;

public class main_Classroom {

    public static class Assignment {

        private String name;
        private double grade;
        private boolean isHomework;

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
            // Example of how to create and print an Assignment
            Assignment assignment = new Assignment("Math Homework", 95.5, true);
            assignment.print();
        }
    }

}
