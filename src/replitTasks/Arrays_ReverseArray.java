package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int[] reversed = new int[nums.length];

        int i = 0;
            for (int j = nums.length-1; j >=0; j--) {

                reversed[i] = nums[j];
                i++;
            }

        System.out.println(Arrays.toString(reversed));
    }
}
/*
Given an array nums with 7 integers already assigned, write code to reverse it.

Do not use any additional arrays or Strings.

Example:


nums -> [55, 100, 1, 44, 2, 3, 4]
nums -> [4, 3, 2, 44, 1, 100, 55]



 */