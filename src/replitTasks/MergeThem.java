package replitTasks;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        char word11 = word1.charAt(0);
        char word12 = word1.charAt(1);
        char word13 = word1.charAt(2);
        char word21 = word2.charAt(0);
        char word22 = word2.charAt(1);
        char word23 = word2.charAt(2);

        if(word1.length()==3 && word2.length()==3){
            System.out.println(""+word11+word21+word12+word22+word13+word23);

        }else {
            System.out.println("cannot merge");
        }

    }
}
/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

Input:
aok
lol
​
Output:
alookl
Input:
aok
lol

Output:
alookl
Input:
ear
pie
​
Output:
epaire
Input:
ear
pie

Output:
epaire
Input:
java
wow
​
Output:
cannot merge
Input:
java
wow

Output:
cannot merge
hint:

by inserting +""+ (empty string) between chars, you can concatenate char values.
 */