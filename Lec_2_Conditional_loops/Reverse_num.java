package Lec_2_Conditional_loops;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Integer init;
        long reverse=0;        
        Scanner input = new Scanner(System.in);
        init = input.nextInt();
        input.close();

        // String num1 = Integer.toString(init);

        // int count = 0;

        while (init > 0) {
            int remainder = init % 10;
            init /= 10;
            reverse = reverse*10 + remainder;
            // long rem = init%10;
            // init = init/10;
            // System.out.println(reverse);
            // System.out.println("After division, init: "+init+"\n");
            // if (reverse == 0 ) {
            //     reverse = rem;
            // }
            // else{
            //     reverse = rem*10 + rem;
            // }
            // System.out.println("After assigning to reverse, remainder is:"+rem+"\n");
            // System.out.println("Which means reverse becomes:"+reverse+"\n");
            // count++;
        }
        System.out.println("Reverse finnaly is: "+reverse+"\n");
    }
}



/*
 * 
 * 
 * 
 */
