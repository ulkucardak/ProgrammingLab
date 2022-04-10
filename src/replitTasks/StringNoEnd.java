package replitTasks;

import java.util.Scanner;

public class StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0, txt.length()-1));

    }
}
/*
Given a String txt print the value without the last letter

Ex:

Input:
foo
Input:
foo
Output:
fo
Output:
fo
Input:
run
Input:
run
Output:
ru
Output:
ru
Hint: Use substring() and length()
 */