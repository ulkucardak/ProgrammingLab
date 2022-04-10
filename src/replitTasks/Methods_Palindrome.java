package replitTasks;

import java.util.Scanner;

public class Methods_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        int temp = num;
        int reversed = 0;
        boolean result = false;

        while (num>0){
            reversed = reversed * 10;
            reversed = reversed + num%10;
            num = num/10;
        }

        if (temp == reversed){
            result = true;
        } else{
            result = false;
        }

        System.out.println(result);
    }


    }

/*
Complete the method isPalindrome() that will check if number is a palindrome.
Print your result as a boolean (true or false).

Challenge: Do not convert int into a string!

Examples:

input: 1001

output: true
input: 1001

output: true
input: 1234

output: false
 */