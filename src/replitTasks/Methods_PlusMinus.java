package replitTasks;

import java.util.Scanner;

public class Methods_PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++) {
            arr[i]=inp.nextInt();
        }

        plus_minus(arr);

    }

    public static void plus_minus (int [] array){
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int each : array) {
            if(each<0){
                countNegative++;
            }else if (each>0){
                countPositive++;
            }else{
                countZero++;
            }
        }

        System.out.println("positives:" + countPositive+", negatives:"+countNegative+ ", zeros:"+countZero);

    }
}
/*
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative ,
ositive and zero numbers are in the array.

Example:

plus_minus (new int[]{1,2,55,-9,-2,0});

output:
positives:3, negatives:2, zeros:1
 */