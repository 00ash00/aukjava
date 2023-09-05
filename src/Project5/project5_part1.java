package Project5;

public class project5_part1 {

    public static void main(String[] args) {

        helloMessage();
        calculator(5, 10);
        double number = 10.0;
        boolean isEvenResult = isEven(number);
        System.out.println(number + " is even?: " + isEvenResult);


        int num1 = 5;
        int num2 = 10;

        int sum = addNumbers(num1, num2);
        int product = multiplyNumbers(num1, num2);

        displayResult("Sum", sum);
        displayResult("Product", product);

    }

    public static void helloMessage() {
        System.out.println("Hello everyone!"); //example of a method with no arguments and no return
    }

    public static void calculator(int num_1, int num_2) {
        int sum = num_1 + num_2;
        System.out.println("The sum of " + num_1 + " and " + num_2 + " = " + sum); //example method with two integer
        // arguments and no return
    }

    public static boolean isEven(double number) {
        return number % 2 == 0; //example of a method with a return and different return type (boolean, double)
        // value returned in the main program
    }

    //DECOMPOSITION

    //calculation 1
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    //calculation 2
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    //display
    public static void displayResult(String operation, int result) {
        System.out.println(operation + " is: " + result);
    }
}

