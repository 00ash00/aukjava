import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        System.out.println("Hey! What's your name?");
//        String name = in.nextLine();
//        System.out.println("Hello " + name);
//
//        System.out.println("How old r u?");
//        String age = in.nextLine();
//        System.out.println("Good! Your age is " + age);
//
//        System.out.println("What's your speciality?");
//        String speciality = in.nextLine();
//        System.out.println("Okay! Your program is " + speciality);

        System.out.println("Tell me more about yourself");
        String aboutMyUser = in.nextLine();
        System.out.println(aboutMyUser.toUpperCase());

        System.out.println(aboutMyUser.contains("228"));




    }
}
