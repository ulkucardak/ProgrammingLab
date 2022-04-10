package replitTasks;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String math, biology, english, chemistry, music;
        double mathGrade, biologyGrade, englishGrade, chemistryGrade, musicGrade, avarageGrade;

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        math=scan.next();
        mathGrade= scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        biology=scan.next();
        biologyGrade=scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        english=scan.next();
        englishGrade=scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        chemistry=scan.next();
        chemistryGrade=scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        music=scan.next();
        musicGrade=scan.nextDouble();

        avarageGrade=(mathGrade+biologyGrade+englishGrade+chemistryGrade+musicGrade)/5;
        System.out.println("Summary: "+math+" - "+mathGrade+ ", "+biology+" - "+biologyGrade+ ", "+ english+" - "+
                englishGrade+ ", "+ chemistry+" - "+chemistryGrade+ ", "+music+" - "+musicGrade+
                "\nYour average score is: "+ avarageGrade+ "\nThank you for using Grader!"+ "\nGoodbye!");



    }
}
/*
Write the program that will calculate the average grade.
Use 5 String variables and 6 double variables to hold the subject and the grade value.
Build a summary with all the information by concatenating the subjects and grades.
Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4
Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */