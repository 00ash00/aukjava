public class Main_2 {

    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Initialize a variable to store the sum
        int sum = 0;

        // Using a for loop to traverse the array and calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            // Access each element by index and add it to the sum
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}
