package CLASSROOM;

public class main {

    public static void main(String[] args) {

        Assignment mathHomework = new Assignment("Math Homework", 112.5, true);
        Assignment historyProject = new Assignment("History Project", 111.3, false);
        Assignment scienceHomework = new Assignment("Science Homework", 150.0, true);


        Course mathCourse = new Course("Math 1", "math1");
        Course historyCourse = new Course("History 2", "history2");
        Course scienceCourse = new Course("Science 3", "science3");


        mathCourse.addAssignment(mathHomework);
        historyCourse.addAssignment(historyProject);
        scienceCourse.addAssignment(scienceHomework);


        MyStudy study = new MyStudy();

        study.addCourse(mathCourse);
        study.addCourse(historyCourse);
        study.addCourse(scienceCourse);


        study.print();
    }
}
