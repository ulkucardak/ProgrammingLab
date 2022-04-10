package replitTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_RemoveEveryOther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }
    public static ArrayList<String> removeEveryOther (ArrayList<String> words){
        ArrayList<String> modified = new ArrayList<>();

        for (int i = 0; i < words.size()-1; i+=2) {
            modified.add(words.get(i+1));
        }

        return modified;
    }
}
/*
Create a method that:

is called removeEveryOther
returns ArrayList of Strings
takes in a single parameter - an ArrayList of Strings called words
This method should take the ArrayList parameter and modify it by removing every other element in the list, starting with removing the 0th element.

For example, if the parameter is:

("hi","yo","sup","yolo","book")
("hi","yo","sup","yolo","book")
The modified ArrayList should be:

("yo","yolo")
 */