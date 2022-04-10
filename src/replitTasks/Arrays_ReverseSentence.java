package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        String [] reversed1= sentence.split(" ");

        for (int i = reversed1.length - 1; i >= 0; i--) {
           reversed += reversed1[i]+ " ";

        }


        System.out.println(reversed.trim());


    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */