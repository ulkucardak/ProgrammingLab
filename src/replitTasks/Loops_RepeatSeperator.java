package replitTasks;

import java.util.Scanner;

public class Loops_RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";

        for (int i = 0; i < count; i++) {
            result += separator + word;

        }
        result = result.replaceFirst(separator,"");
        System.out.println(result);
    }
}
/*
Given two strings, word and a separator sep, return a big string made of count occurrences
of the word, separated by the separator string.

Example:

input:
Word
X
3
​
output: WordXWordXWord
input:
Word
X
3

output: WordXWordXWord
Example:

input:
This
And
2
​
output: ThisAndThis
copied!
input:
This
And
2

output: ThisAndThis
Example:
 */