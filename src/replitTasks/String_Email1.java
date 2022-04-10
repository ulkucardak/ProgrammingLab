package replitTasks;

import java.util.Scanner;

public class String_Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        scan.close();
        if (email.contains("_")){
            String firstName = email.substring(0,email.indexOf('_'));
            String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
            String domain = email.substring(email.indexOf('@'));
            String email1= lastName+"_"+firstName+ domain;

            System.out.println(email1);

        }else{
            System.out.println(email);
        }










    }
}





/*
Swap first name with last name in the email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com
​
output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com
​
output: barakobama@gmail.com
 */