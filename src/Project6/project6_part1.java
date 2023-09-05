package Project6;

public class project6_part1 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; //predefined size

        int size = 5;
        double[] doubleArray = new double[size];//defined in a variable

        String[] stringArray = {"art", "boo", "chip"}; //array creation with different types
        boolean[] booleanArray = {false, true, true};

        //assigning values to array elements
        numbers[3] = 45;
        doubleArray[1] = 3.14;

        System.out.println("5th element value: " + numbers[3]);
        System.out.println("3rd element value: " + doubleArray[1]);

        //index
        int index = 1000;
        if (index >= 0 && index < numbers.length) {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } else {
            System.out.println("Error: Index out of bounds.");
        }

        System.out.println("Traversing numbers using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //traverse the string array
        System.out.println("Traversing stringArray using an enhanced for loop:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        //traverse the boolean array
        System.out.println("Traversing booleanArray using a while loop:");
        index = 0;
        while (index < booleanArray.length) {
            System.out.print(booleanArray[index] + " ");
            index++;
        }
        System.out.println();
    }
}
