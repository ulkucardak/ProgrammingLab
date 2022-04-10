package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] num = new int[size];

        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        if(size<2){
            System.out.println(Arrays.toString(num));
        } else{
            int[] num2 = Arrays.copyOfRange(num,0,2);
            System.out.println(Arrays.toString(num2));
        }




    }
}
/*
Given an int array num of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3
output: [1, 2]
input: 1, 2, 3

output: [1, 2]
input: 1
output: [1]
input: 1

output: [1]
input: 4, 5, 4, 3, 8
output: [4, 5]
 */