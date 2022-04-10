package replitTasks;

import java.util.Scanner;

public class GradesIfStaments {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();

        String result = (grade>0)? (grade>90)?"excellent" :(grade>70)?"good" :(grade>60)?"pass" :"fail"  :"Invalid Number!";

        System.out.println(result);
    }
}

/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is bigger than 90 output "excellent"
if the grade is bigger than 70 and smaller then 90 output "good"
if grade is bigger than 60 and smaller than 70 output "pass"
if grade is smaller than 60 output "fail"
Examples:

93
excellent
93

excellent
46

fail
46

fail
80

good
 */