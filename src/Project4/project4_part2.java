package Project4;
import java.util.Scanner;

public class project4_part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char repeat;

        do {
            // Ask the user to input any string
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();

            //uppercase
            String uppercased = userInput.toUpperCase();
            System.out.println("Uppercased: " + uppercased);

            //user wants to continue
            System.out.print("Do you want to continue? (Y/N): ");
            repeat = scanner.nextLine().charAt(0);

        } while (repeat == 'Y' || repeat == 'y');

        System.out.println("Goodbye!");
    }
}

