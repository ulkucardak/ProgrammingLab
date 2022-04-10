package replitTasks;

import java.util.Scanner;

public class HappyValleySchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter age:");
        int age =scan.nextInt();
        String classType = " ";

        if (age>0){
            if(age<2){
                classType= "ineligible";
            }else if(age==2){
                classType="toddler";
            }else if(age>=3 && age<=5) {
                classType = "early childhood";
            }else if(age>=6 && age<=7){
                classType="young reader";
            }else if(age>=8 && age<=10){
                classType="elementary";
            }else if(age>=11 && age<=12){
                classType="middle";
            }else if(age==13){
                classType="impossible";
            }else if(age>=14 && age<=16){
                classType="high school";
            }else if(age>=17 && age<=18){
                classType="scholar";
            }else if(age>18){
                classType="ineligible";
            }

        }else {
            classType="Invalid number for age!";
        }
        System.out.println(classType);

    }
}
/*
In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

Given age print out the category the student would fall under

Example:

Enter age:
8
elementary
 */