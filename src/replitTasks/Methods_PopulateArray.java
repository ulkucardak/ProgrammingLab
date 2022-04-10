package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_PopulateArray {
    public static void main(String[] args) {
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }

    public static int [] populate (int [] array){

        for (int i = 1, j=0; i <=array.length ; i++, j++) {

            array [j] = i;
        }

       return array;
    }
}
/*
The populate method accepts an empty int array and populates it with numbers counting up.

Example:

populate(new int[3])

returns:[1,2,3]
populate(new int[3])

returns:[1,2,3]
populate(new int[5])

returns:[1,2,3,4,5]
populate(new int[5])

returns:[1,2,3,4,5]
hint:

use a for loop and use the iterator as the current elements value.
 */