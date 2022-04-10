package replitTasks;

import java.util.Scanner;

public class Arrays_2DArray {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];

        int max = 0;

        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();

                if(arr[i][j] > max){
                    max = arr[i][j];
                }

            }//end for cols
        }//end for rows

        System.out.println(max);

    }
}
/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */