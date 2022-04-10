package group_Studies;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String result = "";


        for (int i = 0; i < word1.length(); i++) {
            result += "" +word1.charAt(i)+ word2.charAt(i);
        }
        System.out.println(result);
    }
}
/*
Q-2) Merge any given Strings char by char... input: Java + July -> output: JJauvlay
 */