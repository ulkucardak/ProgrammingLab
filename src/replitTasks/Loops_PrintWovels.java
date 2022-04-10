package replitTasks;

import java.util.Scanner;

public class Loops_PrintWovels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e' ||str.charAt(i)=='i'||  str.charAt(i)=='u' ||
                    str.charAt(i)=='o'){
                result += str.charAt(i);
            }
        }
        System.out.println(result);

    }
}
/*
Create a program that will take the given String In and print out all the
vowels from the String.

Example:

Input: howdyho
​
Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue
​
Output: ueueueue
 */