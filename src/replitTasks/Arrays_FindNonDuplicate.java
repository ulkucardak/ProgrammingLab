package replitTasks;

import java.util.Scanner;

public class Arrays_FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int num : nums) {
            int count = 0;
            for (int each : nums) {
                if(num == each){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(num);

            }

        }



    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

        Example:

        nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */