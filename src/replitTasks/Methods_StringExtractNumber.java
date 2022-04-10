package replitTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods_StringExtractNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));

    }
    public static String extractNum (String str){
        char [] chars = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (char each : chars) {
            list.add(each);
        }
       list.removeIf(p-> !Character.isDigit(p));
        String result = "";

        for (Character character : list) {
            result += character;

        }
        return result;
    }
}
/*
Create a method extractNum that cleans any non number string from a string it gets and returns the clean string

input:

s (string) - given String

return: string: a String of numbers only

Example:

extractNum("aa2aa3") ==> 23
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
hint:

you can use: Character.isDigit() or ascii values
 */