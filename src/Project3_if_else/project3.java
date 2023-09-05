package Project3_if_else;

import java.util.Random;
import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // if/else and switch Syntax
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("The number is equal to 0.");
        } else if (num != 0) {
            System.out.println("The number is not equal to 0.");
        }

        //string comparison
        System.out.print("Enter a word: ");
        String word = in.next();
        String targetWord = "Java";

        if (word.equals(targetWord)) {
            System.out.println("You entered 'Java'.");
        } else {
            System.out.println("You did not enter 'Java'.");
        }

        //logical operators
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age >= 18 && age <= 60) {
            System.out.println("You are between 18 and 60 years old.");
        } else if (age < 18 || age > 60) {
            System.out.println("You are either below 18 or above 60 years old.");
        }

        //nested if/else conditionals
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = in.nextInt();

        if (userInput >= 1 && userInput <= 10) {
            if (userInput % 2 == 0) {
                System.out.println("You entered an even number between 1 and 10.");
            } else {
                System.out.println("You entered an odd number between 1 and 10.");
            }
        } else {
            System.out.println("Your input is not within the specified range.");
        }
    }
}