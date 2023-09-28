package CLASSROOM;

import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private ArrayList<Assignment> assignments; // storing a list of Assignment objects

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public double getAverageHW() {
        double total = 0;
        int count = 0;
        for (Assignment assignment : assignments) {
            if (assignment.isHomework) {
                total += assignment.getGrade();
                count++;
            }
        }
        return count > 0 ? total / count: 0;
    }

    public void print() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Assignments:");
        for (Assignment assignment : assignments) {
            assignment.print();
        }
    }

    public static void main(String[] args) {
        Assignment mathHomework = new Assignment("Math Homework", 95.5, true);
        Assignment historyProject = new Assignment("History Project", 88.0, false);
        Assignment scienceHomework = new Assignment("Science Homework", 90.0, true);


        Course mainCourse = new Course("Main course", "Course01");

        mainCourse.addAssignment(mathHomework);
        mainCourse.addAssignment(historyProject);
        mainCourse.addAssignment(scienceHomework);


        mainCourse.print();


        System.out.println("Average Homework Grade: " + mainCourse.getAverageHW());
    }
}