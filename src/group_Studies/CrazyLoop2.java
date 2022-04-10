package group_Studies;

public class CrazyLoop2 {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {

            for (int j = 0,k=4; j <=i ; j++,k--) {

                if(i==1){
                   k=0;
                }
                System.out.print(i+" "+ (j+k));
            }
            System.out.println();
        }


    }
}
/*

* Print below pattern using loop
        rows : 5
        columns : 5
			1
			2 -"4"- 6                               : row-1
			3 -"4"- 7 -"3"- 10                      : row-1, row-2
			4 -"4"- 8 -"3"- 11 -"2"-13              : row-1, row-2, row-3
			5 -"4"- 9 -"3"- 12 -"2"-14 -"1"- 15     : row-1, row-2, row-3, row-4
 */
