package replitTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_TwoTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(twoTimes(list));

    }
    public static ArrayList<Integer> twoTimes (ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {
            newList.add(each);
            newList.add(each);
        }
        return newList;
    }
}
/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers
This method should create a new ArrayList of Integers that contains every value of the
ArrayList parameter repeated twice.

For example, if the parameter is

(1,5,3,7)
(1,5,3,7)
The method should return a new ArrayList of Integers with

(1,1,5,5,3,3,7,7)
 */