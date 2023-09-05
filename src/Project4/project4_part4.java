//Project4 Part 4

package Project4;
import java.util.Scanner;

public class project4_part4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char repeat = 'Y';

        while (repeat == 'Y' || repeat == 'y') {
            //welcome message
            System.out.println("Welcome to the Book Recommendation System!");
            System.out.print("Please enter your name: ");
            String name = in.nextLine();

            //user's age
            System.out.print("Hello, " + name + "! Please enter your age: ");
            int age = in.nextInt();

            //favorite book genre
            System.out.print("What is your favorite book genre? ");
            in.nextLine(); // Consume the newline character
            String genre = in.nextLine().toLowerCase();

            //book recommendations based on age and genre
            recommendBook(age, genre);

            //user wants to continue
            System.out.print("Do you want to continue? (Y/N): ");
            repeat = in.next().charAt(0);

            in.nextLine();
        }
        System.out.println("Thank you for using our service! Have a great day!");

    }

    //function to recommend a book
    public static void recommendBook(int age, String genre) {
        System.out.println("Here's a book recommendation for you:");

        if (age >= 13 && age <= 16) {
            if (genre.equals("detective")) {
                System.out.println("Recommended book: 'The Big Sleep' by Raymond Chandler");
            } else {
                System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
            }
        } else if (age >= 17 && age <= 25) {
            if (genre.equals("non-fiction")) {
                System.out.println("Recommended book: '\n" +
                        "Silent Spring' by Ken Carson.");
            } else {
                System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
            }
        } else {
            System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
        }
    }
}
