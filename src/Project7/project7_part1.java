package Project7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class project7_part1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.print("Enter the number of elements: ");
            int length = in.nextInt();

            System.out.print("Choose the input method (1 - Random values, 2 - User input): ");
            int inputMethod = in.nextInt();

            int[] array;

            if (inputMethod == 1) {
                array = generateRandomArray(length);
            } else {
                array = getUserInputArray(length);
            }

            System.out.println("Given array: " + Arrays.toString(array));

            bubbleSort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));

            System.out.print("Do you want to repeat? (1 - Yes, 0 - No): ");
            int repeatOption = in.nextInt();

            repeat = (repeatOption == 1);
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

    public static int[] getUserInputArray(int length) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = in.nextInt();
        }

        return array;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}