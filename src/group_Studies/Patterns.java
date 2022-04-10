package group_Studies;

public class Patterns {
    public static void main(String[] args) {
        String result = "";

        for (int i = 0; i < 5; i++) {
            result += "* ";
            System.out.println(result);
        }
        System.out.println("-------------------------------------");
        int row1 = 5;
        for (int i = 1; i <=row1 ; i++) {

            for (int j = row1-i; j>0; j--) {

                System.out.print(" ");

            }
            for (int k = 1; k<=i ; k++) {
                System.out.print("* ");
                
            }
            System.out.println();

        }

        System.out.println("-----------------------------");

        int row = 5;
        for (int i = 1; i <= row; i++) {

            for (int j = 2*(row-i); j>0 ; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }




    }
}



/*
Questions of the week: Print out the patterns below:

*
* *
* * *
* * * *
* * * * *

    *
   * *
  * * *
 * * * *
* * * * *

        *
      * *
    * * *
  * * * *
* * * * *
 */