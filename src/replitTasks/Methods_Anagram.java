package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_Anagram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));

    }

    public static boolean isAnagram(String word1, String word2) {
        boolean result = false;
        char [] word11 = word1.toLowerCase().toCharArray();
        Arrays.sort(word11);
        char [] word22 = word2.toLowerCase().toCharArray();
        Arrays.sort(word22);

         result = Arrays.equals(word11,word22);

         return result;
    }
}
