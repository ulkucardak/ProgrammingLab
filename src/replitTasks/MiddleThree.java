package replitTasks;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int middleIndex = (word.length()-1)/2;

        if (word.length()>=5 && word.length()%2==1){

            System.out.println("" +word.charAt(middleIndex-1)+ word.charAt(middleIndex)+ word.charAt(middleIndex+1));
        }else {
            System.out.println("invalid");
        }



    }
}
/*
Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters.
If the word does not meet the requirements print invalid.

fifteen ==> fte
fifteen ==> fte
apple ==> ppl
apple ==> ppl
hey ==> invalid
hey ==> invalid
java ==> invalid
java ==> invalid
whatsup ==> ats
whatsup ==> ats
$ ==> invalid
 */