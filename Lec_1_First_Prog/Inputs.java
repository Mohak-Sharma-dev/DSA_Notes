import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
         //INPUTS OF USER 
        //STEP 1: Make an instance/object of Scanner class
        Scanner input = new Scanner(System.in);
        /* Scanner: Provides methods to get inputs
         * Input: Name of the objects, can be anything(Depends on the context, usually input, scanner, etc)
         * new: Keyword reserved to make new objects.
         * Scanner(System.in): Constructor of Scanner class, takes input from the console.
         * 
         */
        //STEP 2:Prompt the user.
        System.out.println("Enter your name: ");
        //Step 3: Gte the input.
        System.out.println(input.nextLine());//One way.

        /* One line does all of the following:
         * Takes the input, 
         * stores it in the input objects, 
         * Then prints to the console.
         */
        //Another way.
        System.out.println("Enter your name: ");
        String name = input.nextLine();//Another way.
        System.out.println(name);
    }
}
