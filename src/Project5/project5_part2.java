package Project5;

import java.util.Scanner;

public class project5_part2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char repeat;

        System.out.println("Welcome to the Book Recommendation System!");

        //infinite main program
        while (true) {
            String name = getUserString(in, "Please enter your name: ");
            int age = getUserInt(in, "Hello, " + name + "! Please enter your age: ");
            String genre = getUserString(in, "What is your favorite book genre? ").toLowerCase();

            recommendBook(age, genre);

            //call method "repeat", to ask user if he wants to continue.

            repeat = getYesOrNoInput(in, "Do you want to continue? (Y/N): ");

            if (repeat != 'Y' && repeat != 'y') {
                System.out.println("Thank you for using our service! Have a great day!");
                break; // Exit the loop when the user chooses 'N' or 'n'
            }
        }
    }

    //function to recommend a book (age and genre)
    public static void recommendBook(int age, String genre) {
        System.out.println("Here's a book recommendation for you:");

        if (age >= 13 && age <= 16) {
            if (genre.equals("detective"))  {
                System.out.println("Recommended book: 'The Big Sleep' by Raymond Chandler");
            } else {
                System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
            }
        } else if (age >= 17 && age <= 25) {
            if (genre.equals("non-fiction")) {
                System.out.println("Recommended book: 'Silent Spring' by Ken Carson.");
            } else {
                System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
            }
        } else {
            System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
        }
    }

    //custom method to get int from user
    public static int getUserInt(Scanner in, String message) {
        System.out.println(message);
        return in.nextInt();
    }

    //custom method to get string from user
    public static String getUserString(Scanner in, String message) {
        System.out.println(message);
        in.nextLine();
        return in.nextLine();
    }

    //method yes/no
    public static char getYesOrNoInput(Scanner in, String message) {
        while (true) {
            System.out.println(message);
            String response = in.next().trim().toLowerCase();
            if (response.equals("y") || response.equals("n")) {
                return response.charAt(0);
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
    }

    //print messages
    public static void print(String message) {
        System.out.println(message);
    }
}
