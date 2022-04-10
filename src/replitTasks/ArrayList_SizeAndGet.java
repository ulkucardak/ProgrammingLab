package replitTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_SizeAndGet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(sum(list));

    }
    public static int sum(ArrayList<Integer> nums)	{
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;

    }
}
/*
Task: Given an ArrayList of Integers called nums, find and return the sum of all the numbers in the list
 */