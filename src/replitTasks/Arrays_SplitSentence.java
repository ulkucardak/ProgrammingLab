package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] sentence2 = sentence.split(" ");

        for (String each : sentence2) {
            System.out.println(each);

        }

    }
}
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"
Print
Java
is
fun
 */