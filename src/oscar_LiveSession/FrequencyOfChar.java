package oscar_LiveSession;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int frequencyOfA = 0;

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='A' ){
                frequencyOfA += 1;
            }

        }
        System.out.println(frequencyOfA);

    }
}
/*
Q-1) In a given String, find out how many times char 'a' is appeared...

    Example:
    input: String word = "javaxjava";
    output: 4
 */