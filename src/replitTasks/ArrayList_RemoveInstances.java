package replitTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_RemoveInstances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        Integer m = n;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, m));


    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
        r.removeAll(Arrays.asList(n));

        return r;




    }
}
/*
This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.

It removes any instance of the given number from the Arraylist.

Example:

romoveInst([1,1,2,3,1,4],1)

returns: [2,3,4]
romoveInst([1,1,2,3,1,4],1)

returns: [2,3,4]
romoveInst([3,4,3,3],4)

returns: [3,3,3]
 */