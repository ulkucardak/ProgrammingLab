package replitTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vehicle's years: ");
        int yearsOfModel = scan.nextInt();
        if (yearsOfModel>=1995 && yearsOfModel<=1998 || yearsOfModel>=2001 && yearsOfModel<=2002
                || yearsOfModel>=2004 && yearsOfModel<=2006 || yearsOfModel>=2015 && yearsOfModel<=2017){
            System.out.println("Your vehicle needs to be recalled!");
        } else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
        scan.close();

    }
}
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

If the year is in the provided range print: Your vehicle needs to be recalled!

If the year is fine print: Your vehicle is fine, enjoy!

Example:

Enter vehicle's year:
1996
Your vehicle needs to be recalled!
Enter vehicle's year:
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
2018
Your vehicle is fine, enjoy!
 */