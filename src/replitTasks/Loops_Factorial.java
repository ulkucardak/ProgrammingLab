package replitTasks;

import java.util.Scanner;

public class Loops_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = 1;


        for (int i = num; i >= 1; i--) {
           result *= i;


        }

        System.out.println(result);

    }
}
/*
In mathematics a factorial of a positive integer n, denoted by n!,
is the product of all positive integers less than or equal to n. Calculate factorial
and output result to the console.

Example:

input: 5
output: 120

5 * 4 * 3 * 2 * 1
 */