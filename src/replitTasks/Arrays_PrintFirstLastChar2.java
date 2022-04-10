package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintFirstLastChar2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String twoChar = "";
        for (String each : words) {
            twoChar +=("" +each.charAt(0) + each.charAt(each.length()-1))+ " ";
        }

        String [] twoChars = twoChar.split(" ");
        System.out.println(Arrays.toString(twoChars));
    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */