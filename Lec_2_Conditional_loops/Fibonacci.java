package Lec_2_Conditional_loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0;
        int init = 1;
        int count = 2;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        while (count <= n) {
            int temp = init;
            init = init + prev;
            prev = temp;
            count++;
            System.out.println(init);
        }

    }
    
}
