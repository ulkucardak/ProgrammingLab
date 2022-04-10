package replitTasks;

import java.util.Scanner;

public class Methods_IsEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));

    }
    public static boolean isEven(int n) {
        boolean result = false;
        if(n%2==0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
/*
isEven accepts a number and checks if it is even. If the given number is even return true, otherwise return false.

Examples:

isEven(1) --> false
isEven(1) --> false
isEven(8) --> true
 */