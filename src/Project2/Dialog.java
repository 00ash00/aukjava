//Part 2. Dialog.

package Project2;

import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Personal ChatBot.");

        //Starting to get personal information from user.

        System.out.println("What's your name? ");
        String name = in.nextLine();

        System.out.println("Okay, " + name + "! What's your age? ");
        int age = Integer.parseInt(in.nextLine());

        System.out.println("Are you male or you are female? ");
        String gender = in.nextLine();

        System.out.println("Understood! So, in which city do you live in? ");
        String city = in.nextLine();

        System.out.println("Alright. What's your Instagram nickname or your Twitter (X) nickname? ");
        String nickname = in.nextLine();

        System.out.println("What's your phone number?");
        String PhoneNumber = in.nextLine();

        System.out.println("Let me know your favorite hobby.");
        String hobby = in.nextLine();

        //Summarizing all information.

        System.out.println("Thank you for your information. Your information is showing below.");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("City: " + city);
        System.out.println("Nickname: " + nickname);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Hobby: " + hobby);


        //Operations.

        System.out.println("Let's do some checks with your information.");

        //contains()
        System.out.println("Enter your nickname. If it's right?");
        String CheckWord = in.nextLine();

        //if and else to check the accuracy.
        if (nickname.contains(CheckWord)){
            System.out.println("Alright. Everything is okay. I have " + nickname + " In my base.");
        } else {
            System.out.print("I think, you made a mistake, yes?");
        }

        //startsWith()
        System.out.println("Okay. Excuse me, but my base is lagging. Let me recall the first letter of your city! ");
        String StartLetter = in.nextLine();
        boolean Result = false;


        if (city.startsWith(StartLetter)){
            System.out.println("Oh! I remember! Your city is "+ city + " !");

        } else {
            System.out.print("Oh, I'm sorry. My result = " + Result);
        }

        //indexOf()
        System.out.print("Enter a character to find its position in your name: ");
        char charToFind = in.nextLine().charAt(0);
        int index = name.indexOf(charToFind);
        if (index != -1) {
            System.out.println("The character " + charToFind + " is at position " + index + " in your name.");
        } else {
            System.out.println("The character " + charToFind + " wasn't found in your name.");
        }

        //The end
        System.out.print("That's all! Thank you for the dialog. Bye!");

    }
}
