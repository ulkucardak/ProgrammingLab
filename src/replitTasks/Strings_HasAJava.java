package replitTasks;

import java.util.Scanner;

public class Strings_HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()>5){
            if(word.substring(0,4).equalsIgnoreCase("java") || word.substring(1,5).equalsIgnoreCase("java")){
                exists = true;
        }

        }else{
            exists = false;
        }
        System.out.println(exists);
    }
}
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length,
including 0.

Example:

input: javapython
​
output: true
input: javapython

output: true
input: cjavac++
​
output: true
input: cjavac++

output: true
input: c#javaruby
​
output: false
 */