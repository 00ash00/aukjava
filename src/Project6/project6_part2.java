package Project6;

import java.util.*;

public class project6_part2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] userArray = inputArray(in, 5);
        printArray(userArray);

        int[] randomArray = createRandomArray(7);
        printArray(randomArray);

        int sum = sumArrayElements(userArray);
        System.out.println("Sum of array elements: " + sum);

        int largestValue = findLargestValue(randomArray);
        System.out.println("Largest value in the array: " + largestValue);

        int[] searchArray = createRandomArray(10);
        printArray(searchArray);
        int searchValue = 42;
        int index = searchValueInArray(searchArray, searchValue);
        System.out.println(index != -1 ? "Found " + searchValue + " at index " + index : searchValue +
                " not found in the array.");
    }

    // input by user
    public static int[] inputArray(Scanner in, int length) {
        int[] array = new int[length];
        System.out.println("Enter " + length + " elements for the array:");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    // random array creation
    public static int[] createRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // values between 0 and 99
        }
        return array;
    }

    // printing
    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // sum of array
    public static int sumArrayElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // the largest value
    public static int findLargestValue(int[] array) {
        int largest = array[0];
        for (int i : array) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    // search value
    public static int searchValueInArray(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
