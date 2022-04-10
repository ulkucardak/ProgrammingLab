package replitTasks;

import java.util.Scanner;

public class TeacherName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String result = " ";

        if (name.equals("Chen")) {
            result="teacher";
        } else {
            result="student";
        }
        System.out.println(result);
    }
}