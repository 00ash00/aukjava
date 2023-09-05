//Project 3 Part2

package Project3_if_else;
import java.util.Scanner;

public class project3_part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Welcome message and user-friendly conversation
        System.out.println("Welcome to the Daily Activity Determiner!");
        System.out.print("Please enter your age: ");

        int age = in.nextInt();

        String activity = determineActivity(age);
        System.out.println("Based on your age, your daily activity is likely: " + activity);

        // Thank the user
        System.out.println("Thank you for using our service! Have a great day!");
    }

    // Function to determine daily activity based on age
    public static String determineActivity(int age) {
        if (age < 6) {
            return "Home, play, and kindergarten.";
        } else if (age >= 7 && age <= 17) {
            return "School.";
        } else if (age >= 18 && age <= 22) {
            return "University.";
        } else if (age > 23 && age <= 60) {
            return "Work.";
        } else if (age > 60 && age <= 100) {
            return "We couldn't determine your daily activity.";
        } else {
            return "";
        }
    }
}
