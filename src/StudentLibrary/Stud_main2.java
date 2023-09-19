package StudentLibrary;

import java.util.Calendar;

class Student_2 {
    public String name;
    public String surname;

    private String program;
    private int enrolmentYear;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public void setEnrolmentYear(int enrolmentYear) {
        this.enrolmentYear = enrolmentYear;
    }

    public void printInfo() {
        System.out.println(getInfo());
    }

    public String getInfo() {
        return name + " " + surname;
    }

    public Student_2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    public int getYearOfStudy() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - enrolmentYear;
    }
}

public class Stud_main2 {
    public static void main(String[] args) {
        Student_2 student = new Student_2("Gosha", "Goshinskiy");

        Student_2 student2 = new Student_2("Valera", "Valerskiy");

        student.printInfo();
        student.setEnrolmentYear(2000);
        student2.printInfo();
        student2.setEnrolmentYear(2002);


        System.out.println("Year of study:" + student2.getYearOfStudy());
        System.out.println("Year of Study: " + student.getYearOfStudy());
    }
}