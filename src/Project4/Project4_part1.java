//Project4 Part 1

package Project4;

public class Project4_part1 {
    public static void main(String[] args) {
        // while loop
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // increment
        System.out.println("Using for loop (increment):");
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // decrement
        System.out.println("Using for loop (decrement):");
        for (int k = 10; k >= 1; k--) {
            if (k != 6 && k != 4) { // Skipping 6 and 4
                System.out.print(k + " ");
            }
        }
        System.out.println(); // eparation

        // Iterating through a String
        System.out.println("Iterating through a String:");
        String text = "Hello, World!";
        int index = 0;
        while (index < text.length()) {
            System.out.println(text.charAt(index));
            index++;
        }
        System.out.println();

        // nested loops
        System.out.println("Using nested loops:");
        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 3; inner++) {
                System.out.println("Outer Loop: " + outer + ", Inner Loop: " + inner);
            }
        }
    }
}
