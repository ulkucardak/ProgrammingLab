package replitTasks;

import java.util.Scanner;

public class Methods_CountLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
    public static String countLetters(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch==ch2){
                    frequency +=1;
                }
            }
            if(result.contains(""+ ch)){
                continue;
            }
            result += frequency;
            result += ch;

        }


        return result;


    }
}
/*
Write a method countLetters that can count letters in a given string and
return a new string in the given format:

number of letters + letter
number of letters + letter
Example:

input: countLetters("aaabbcccc");

output: "3a2b4c"
 */