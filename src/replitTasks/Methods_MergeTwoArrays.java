package replitTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Methods_MergeTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];

        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums,nums2)).replace(" ",""));
    }

    public static int[] mergR(int[] a,int[] b) {
        int [] mergedArray = new int [a.length + b.length];

        for (int i = 0,j=0; i < a.length; i++,j++) {
            mergedArray[j] = a [i];
        }
        for (int i = 0, j= a.length; i < b.length; i++,j++) {
            mergedArray [j] = b [i];

        }


        return mergedArray;

    }
}
