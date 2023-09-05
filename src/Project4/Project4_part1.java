package Project4;

public class Project4_part1 {
    public static void main(String[] args) {

        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //do-while loop
        System.out.println("Using do-while loop:");
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println(); // Newline for separation

        //for loop
        System.out.println("Using for loop (increment):");
        for (int k = 1; k <= 10; k++) {
            System.out.print(k + " ");
        }
        System.out.println();

        //for loop (decrement)
        System.out.println("Using for loop (decrement):");
        for (int l = 10; l >= 1; l--) {
            System.out.print(l + " ");
        }
        System.out.println(); // Newline for separation

        // Iterate through a String
        System.out.println("Iterating through a String:");
        String text = "Hello, World!";
        for (int m = 0; m < text.length(); m++) {
            System.out.println(text.charAt(m));
        }
        System.out.println();

        //nested loops
        System.out.println("Using nested loops:");
        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 3; inner++) {
                System.out.println("Outer Loop: " + outer + ", Inner Loop: " + inner);
            }
        }
    }
}
