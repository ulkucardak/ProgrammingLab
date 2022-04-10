package replitTasks;

import java.util.Scanner;

public class Methods_IsPos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++){
            arr[i]=inp.nextInt();
            isPos(arr[i]);
        }


    }
    public static void isPos(int num){
       if(num>0){
           System.out.println("positive");
       }else if (num<0){
           System.out.println("negative");
       }else{
           System.out.println("zero");
       }

    }
}
/*
isPos is a method that checks if an int is positive or negative

If the int num is positive print positive, negative, or zero

Complete main method by calling isPos method for each element in the array arr.
 */