package Project7;

import java.util.Random;

public class project7_part2 {

    public static void main(String[] args) {
        int[] array = generateRandomArray(5);

        System.out.println("Initial array:");
        printArray(array);
        System.out.println();

        System.out.println("Sorting iterations:");
        bubbleSortWithSnapshots(array);

        System.out.println();
        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void bubbleSortWithSnapshots(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("Outer loop, iteration " + (i + 1) + ":");
            printArray(array);
            System.out.println();

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("Inner loop, iteration " + (j + 1) + ":");
                printArray(array);

                // Swap array J and array J + 1
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.print("  (Swapped elements: " + array[j] + " and " + array[j + 1] + ")");
                    swapped = true;
                }

                System.out.println();
            }

            // If array is ended - break
            if (!swapped) {
                break;
            }

            System.out.println();
        }
    }

    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}