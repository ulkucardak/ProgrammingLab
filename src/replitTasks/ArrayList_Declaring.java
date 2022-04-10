package replitTasks;

import java.util.ArrayList;

public class ArrayList_Declaring {
    public static void main(String[] args) {

        System.out.println(test());
    }
    public static ArrayList<Integer> test(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return list;


    }
}
