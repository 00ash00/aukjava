//Project4 Part 3

package Project4;

import java.util.Scanner;

public class project4_part3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Input any string:");
            String str = in.nextLine();

            for (int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);
                System.out.print(c);
            }

            System.out.println("\nWould you like to continue (Y/N)?");
            String str2 = in.nextLine();

            if (str2.equals("N")) {
                System.out.println("Ok, thank you!");
                break;
            } else if (!str2.equals("Y")) {
                System.out.println("Incorrect information. Exiting.");
                break;
            }
        }
    }
}
