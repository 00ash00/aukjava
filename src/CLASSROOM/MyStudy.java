package CLASSROOM;

import java.util.ArrayList;

public class MyStudy {

    private ArrayList<Course> courses;

    public MyStudy() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course C) {
        courses.add(C);
    }

    public double getAverageHW() {
        double total = 0;
        int count = 0;
        for (Course course : courses) {
            total += course.getAverageHW();
            count++;
        }
        return count > 0 ? total / count: 0;
    }

    public void print() {
        System.out.println("Study Plan:");
        for (Course course : courses) {
            course.print();
            System.out.println("-----------------------");

            System.out.println("Overall Homework average: " + getAverageHW());

        }
    }

    public static void main(String[] args) {
        MyStudy study = new MyStudy();
        Course mathCourse = new Course("Main Course_2", "Course2");
        mathCourse.addAssignment(new Assignment("Math Homework", 95.5, true));
        study.addCourse(mathCourse);

        study.print();

    }
}
