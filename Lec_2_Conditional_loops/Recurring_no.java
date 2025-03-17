package Lec_2_Conditional_loops;


import java.util.Scanner;

public class Recurring_no {
    public static void main(String[] args) {
        //Take the remainder of any value by 10 to get the last value.
        int num;
        int repeat;
        // int check;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        num = input.nextInt();
        System.out.println("Enter the number you want to check for: ");
        repeat = input.nextInt();


        input.close();
        while (num>0) {//Only allow if number greater than 0
            int rem = num%10;//Remainder will be equal to the number being checked, then:

            if(rem == repeat){
                count++;//Count the number of times the number has appeared.
            }
            num = num/10;//divide the number to shorten it.
            //Repeat until no numbers left.
        }
        System.out.println(repeat +" has appeared "+ count+" times.");//Output the result.

    }
    
}
