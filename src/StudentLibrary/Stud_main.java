package StudentLibrary;

class Student{

public String name;
public String surname;

public Student(String name, String surname){

    this.name = name;
    this.surname = surname;

}


public void printInfo(){
    System.out.println(getInfo());
}

public String getInfo(){

    return name + " " + surname;

}


}




public class Stud_main {

    public static void main(String[] args) {

        Student std = new Student("Gosha", "Goshinskiy");

        std.printInfo();

    }
}