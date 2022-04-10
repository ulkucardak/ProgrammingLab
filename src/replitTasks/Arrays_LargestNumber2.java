package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_LargestNumber2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];

        int max = 0;
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();

                if(arr[i][j] > max){
                    max = arr[i][j];
                }

            }//end for cols
        }//end for rows

        for (int k = 0; k <=rows-1 ; k++) {

            for (int l = 0; l <=cols-1 ; l++) {

                arr[k][l] = max;

            }

        }







        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));



    }
}
/*
Given a 2d array of ints, find the biggest number(integer) and replace all array values on biggest number in the array then print an array.

Example:

Given values: [[1, 2, 3], [5, 33, 9]]
output: [[33, 33, 33], [33, 33, 33]]
 */