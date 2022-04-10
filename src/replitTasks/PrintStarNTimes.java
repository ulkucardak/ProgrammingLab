package replitTasks;

import java.util.Scanner;

public class PrintStarNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result = "";


        for (int j = 1; j <=n ; j++) {
            result += "*";

        }
        System.out.println(result);


    }
}
/*
Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1
​
output: *
input: 1

output: *
Example:

input: 3
​
output: ***
 */