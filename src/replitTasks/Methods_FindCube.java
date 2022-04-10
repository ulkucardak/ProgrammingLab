package replitTasks;

import java.util.Scanner;

public class Methods_FindCube {
    public static void main(String[] args) {
        cube();


    }

    public static void cube (){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int result = num * num * num;
        System.out.println(result);
    }

}
/*
Create a method called cube. It is a void method with no arguments. Write all required code
inside this method in order to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5

output: 125
input: 5

output: 125
hint: cube of a number n = n^3
 */