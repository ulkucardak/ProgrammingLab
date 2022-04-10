package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        int[] newArray = new int[size*2];

        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i = 0; i < newArray.length-1; i++) {
            newArray[newArray.length-1] = nums[size-1];
            newArray[i] = 0;

        }
        System.out.println(Arrays.toString(newArray));

    }
}
/*
Given an int array nums print a new array with double the length where its last element
is the same as the original array, and all the other elements are 0.
The original array will be length 1 or more. Hint: by default, a new int array contains all 0's.

Examples:

input: 4 5 6

output: [0, 0, 0, 0, 0, 6]
input: 4 5 6

output: [0, 0, 0, 0, 0, 6]
input: 0

output: [0, 0]
input: 0

output: [0, 0]
input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]
 */