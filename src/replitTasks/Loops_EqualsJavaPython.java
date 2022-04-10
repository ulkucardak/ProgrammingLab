package replitTasks;

import java.util.Scanner;

public class Loops_EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int frequencyOfJava= 0;
        int frequencyOfPython = 0;


        for (int i = 0; i <= sentence.length()-4; i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                frequencyOfJava += 1;
            }
        }
            for (int j = 0; j <= sentence.length()-6; j++) {
                if (sentence.substring(j, j + 6).equals("python")) {
                    frequencyOfPython += 1;
                }
            }

                if(frequencyOfJava==frequencyOfPython){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }





    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere
in the string is equal to the number of appearances of "python" anywhere
in the string (case sensitive).

Example:

input: We study java not python
​
output: true
input: We study java not python

output: true
Example:

input: What's the difference between java, javascript and python?
​
output: false
 */