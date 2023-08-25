//Part1. Syntax.

package Project2;

import java.util.Scanner;

public class project2VariablesDataTypes {
    public static void main(String[] args){
        //Creating Scanner.
        Scanner in = new Scanner(System.in);
        //Creating new DataTypes.
        int NumberA = 5;
        double NumberB = 1.55;
        char Letter = 'a';
        boolean LetterIsA = true;
        String Hello = "Hy, My name is Alexander.";

        //Manipulations with all these types.
        System.out.println("Let's combine NumberA + NumberB");
        System.out.println(NumberA + NumberB + " - This is a result! (Number A + Number B)");

        System.out.println("We have a letter -> " + Letter + ". Let's find if our letter is true.");

        // Checking Variable Letter.
        //I remember that you have shown us how to use if in Java, so I decided to add this to my project.
        if (Letter == 'a') {
            System.out.println("The result is " + LetterIsA);
        }

        //Input and Output.
        System.out.println(Hello);
        System.out.print("What's your name? Type here: ");
        String name = in.nextLine();
        System.out.println("Nice to meet you, " + name);
    }
}
