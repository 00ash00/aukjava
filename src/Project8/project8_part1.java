package Project8;

public class project8_part1 {

    public static void main(String[] args) {
        int n = 9;

        System.out.println("Printing numbers backward:");
        printNumberBackward(n);
        System.out.println("Printing numbers forward:");
        printNumberForward(n);

        recursiveMethod();

    }

    public static void printNumberBackward(int n){

        if (n >= 1) {
            System.out.println(n + " ");
            printNumberBackward(n - 1);
        }
    }


    public static void printNumberForward(int n){
        if (n >= 1){
            printNumberForward(n - 1);
            System.out.println(n + " ");
        }
    }

    public static void recursiveMethod() {
        System.out.println("Hi");
        recursiveMethod();
    }
}

