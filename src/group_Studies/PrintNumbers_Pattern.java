package group_Studies;

public class PrintNumbers_Pattern {
    public static void main(String[] args) {

        for (int k = 7; k >=1 ; k--) {

            for (int l = 1; l <=k; l++) {

                System.out.print(l +" ");
            }

            System.out.println();
        }

        System.out.println("------------------------");


        for (int i = 1; i < 8; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
/*

		1 2 3 4 5 6 7		or:		1				*** 2nd one very important ***
		1 2 3 4 5 6					1 2
		1 2 3 4 5					1 2 3
		1 2 3 4						1 2 3 4
		1 2 3						1 2 3 4 5
		1 2						    1 2 3 4 5 6
		1						    1 2 3 4 5 6 7
 */