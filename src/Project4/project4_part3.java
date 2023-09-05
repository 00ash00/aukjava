package Project4;

import java.util.Scanner;

public class project4_part3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char repeat = 'Y';

        while (repeat == 'Y' || repeat == 'y') {
            // input any string
            System.out.print("Enter a string: ");
            String userInput = in.nextLine();

            // string in reversed order
            String reversedString = new StringBuilder(userInput).reverse().toString();
            System.out.println("Reversed string: " + reversedString);

            // user wants to continue
            System.out.print("Do you want to continue? (Y/N): ");
            repeat = in.nextLine().charAt(0);
        }

        System.out.println("Goodbye!");
    }
}
