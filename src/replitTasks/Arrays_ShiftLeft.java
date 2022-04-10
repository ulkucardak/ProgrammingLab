package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ShiftLeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        int []newNums = new int [size];

        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        for (int i = 0, j=0; i < size; i++,j++) {

            if(j==0){
                newNums [j+ (size-1)] = nums [i];
            }else {
                newNums [j-1] = nums [i];
            }
        }

        System.out.println(Arrays.toString(newNums));







    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
                                                     0  1  2  3           0  1  2  3

You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
 */