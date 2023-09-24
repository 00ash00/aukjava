    package Project8;
    
    import java.util.Scanner;
    
    public class project8_part2 {
    
        public static void main(String[] args) {
    
            Scanner in = new Scanner(System.in);
    
            int[] array = {1, 2, 3, 4, 5};
    
            System.out.println("Array elements:");
            printArray(array, 0);
    
            int sum = arraySum(array, 0);
            System.out.println("Sum of array elements is " + sum);
    
            System.out.println("What element you want to find? ");
            int value = in.nextInt();
    
            int count = findCountInArray(array, value, 0);
            System.out.println("Count of " + value + " in array: " + count);
        }
    
        public static void printArray(int[] array, int i) {
            if (i < array.length) {
                System.out.println(array[i]);
                printArray(array, i + 1);
            }
        }
    
        public static int arraySum(int[] array, int i) {
            if (i < array.length) {
                return array[i] + arraySum(array, i + 1);
            } else {
                return 0;
            }
        }
    
        public static int findCountInArray(int[] array, int what, int i) {
            if (i < array.length) {
                if (array[i] == what) {
                    return 1 + findCountInArray(array, what, i + 1);
                } else {
                    return findCountInArray(array, what, i + 1);
                }
            } else {
                return 0;
            }
        }
    }