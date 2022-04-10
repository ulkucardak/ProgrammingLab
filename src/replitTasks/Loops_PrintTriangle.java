package replitTasks;

import java.util.Scanner;

public class Loops_PrintTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Please enter a number:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
          result += "*";
            System.out.println(result);
        }


    }
}
/*
Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5
​
output:
*
**
***
****
*****
input: 5

output:
*
**
***
****
*****
Example:

input: 3
​
output:
*
**
***
 */
