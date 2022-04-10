package replitTasks;

import java.util.Scanner;

public class Strings_WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";

        if(word.contains("x") || word.contains("X") ){
            String word1 = word.replace('x',' ').trim();
            result = word1.replace('X',' ').trim();

        }else{
            result = word;
        }
        System.out.println(result);
    }
}
/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX
​
output: Hi
input: xHiX

output: Hi
input: apple
​
output: apple
input: apple

output: apple
input: xUxL
​
output: UxL
input: xUxL

output: UxL
input: JavaX
​
output: Java
 */