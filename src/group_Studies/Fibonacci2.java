package group_Studies;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the term number for Fibonacci Series ? : ");
        int n = scan.nextInt();
        int num1 =0;
        int num2 = 1;
        String series = ""+ num1+ " "+ num2+ " ";

        for (int i = 0; i < n; i++) {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            series += sum+ " ";
        }
        System.out.println("series = " + series);
    }
}
/*
        This is a example of Fibonacci series of 6 terms
		term number		0	1	2	3	4	5	6  7
		Actual value	0, 	1, 	1, 	2, 	3, 	5, 	8  13
 */