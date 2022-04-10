package replitTasks;

import java.util.ArrayList;

public class ArrayList_Add {
    public static void main(String[] args) {
        System.out.println(test().size());

    }
    public static ArrayList<String> test(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ulku");
        names.add("Betul");
        names.add("Ahmet");






        return names;
    }
}
/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.

strs.add("Hello");
strs.add("Hello");
The syntax is:

arraylistvariable.add(data_to_add);
arraylistvariable.add(data_to_add);
In the test() method, add three names (any names) to the ArrayList called names.
 */