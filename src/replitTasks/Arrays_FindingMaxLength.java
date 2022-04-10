package replitTasks;

import java.util.Scanner;

public class Arrays_FindingMaxLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        int maxLength = 0;
        for (String word : words) {

            if(word.length()>maxLength){
                maxLength = word.length();
            }
        }
        for (String word : words) {

            if(word.length()==maxLength){
                System.out.println(word);
            }

        }





    }
}
/*
Given the array words find and print the word with the largest length.
Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */