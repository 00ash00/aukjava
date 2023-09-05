//Project3 Part 3

package Project3_if_else;
import java.util.Scanner;


public class project3_part3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Book Recommendation System!");
        System.out.print("May I know your name? ");
        String name = in.nextLine();

        // Ask for age
        System.out.print("Hello, " + name + "! Please enter your age: ");
        int age = in.nextInt();

        // Ask for a book genre
        System.out.print("What is your favorite book genre? ");
        in.nextLine(); // Consume the newline character
        String genre = in.nextLine().toLowerCase();

        // Provide book recommendations based on age and genre
        recommendBook(age, genre);

        // Thank the user and close the scanner
        System.out.println("Thank you, " + name + "! Enjoy your reading!");
    }

    // Function to recommend a book based on age and genre
    public static void recommendBook(int age, String genre) {
        System.out.println("Here's a book recommendation for you:");

        if (age >= 13 && age <= 16) {
            if (genre.equals("detective")) {
                System.out.println("Recommended book: 'Nancy Drew: The Secret of the Old Clock' by Carolyn Keene.");
            } else {
                System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
            }
        } else if (age >= 17 && age <= 25) {
            if (genre.equals("non-fiction")) {
                System.out.println("Recommended book: 'Sapiens: A Brief History of Humankind' by Yuval Noah Harari.");
            } else {
                System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
            }
        } else {
            System.out.println("Sorry, we don't have a specific recommendation for your age and genre.");
        }
    }
}
