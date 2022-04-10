package replitTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Remove {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextDouble());
        }

        System.out.println(test(list));
    }
    public static ArrayList<Double> test (ArrayList<Double> dubs){
        dubs.remove(0);
        dubs.remove(0);
        return dubs;


    }
}
