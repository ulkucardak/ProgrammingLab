package replitTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods_ReverseLetters {
    public static void main(String[] args) {
        String str = "Ab,c,de!$";
        String newString= reverseNoSpec(str);
        System.out.println(newString);

    }
    /*public static String reverseNoSpec(String str) {

        char [] chars = str.toCharArray();
        char [] result = new char [chars.length];
        ArrayList<Character> list = new ArrayList<>();

        for (int i = chars.length-1,j =0; i >=0 ; i--,j++ ) {
            if (!(Character.isLetterOrDigit(chars[i]))){
                result [i] = chars [i];

            }
            if(Character.isLetterOrDigit(chars[i])){

                result [j] = chars [i];
            }
        }
        String newString = "";
        for (char each : result) {
            newString += each;

        }
        return newString;
    }*/
    public static String reverseNoSpec(String str) {
        String result = "";
        String[] allChar = str.split("");
        ArrayList<String> fromBegining = new ArrayList<>(Arrays.asList(allChar));
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < fromBegining.size(); i++) {
            if (Character.isLetterOrDigit(fromBegining.get(i).charAt(0))) {
                indexes.add(i);
            }
        }
        for (int i = 0; i < indexes.size() / 2; i++) {
            Collections.swap(fromBegining, indexes.get(i), indexes.get(indexes.size() - 1 - i));
        }
        for (String each : fromBegining) {
            result += each;
        }
        return result;
    }

    }

/*
Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
Input:   str = "Ab,c,de!$"
                01,3,56!$
Output:  str = "ed,c,bA!$"
                01,3,56!$
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "----qwe--r--tyf...gd.---"

Output:  str = "----dgf--y--tre...wq.---"
 */