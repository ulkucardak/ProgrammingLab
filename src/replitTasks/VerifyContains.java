package replitTasks;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean result = true;

        if(sentence.contains(word)){
             result = true;
        }else{
            result = false;
        }
        System.out.println(result);
    }
}
/*
Write a program that will verify if the sentence contains word.
Print out the result as a boolean value.
 */