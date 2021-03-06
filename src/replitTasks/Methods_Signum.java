package replitTasks;

import java.util.Scanner;

public class Methods_Signum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
    }
    public static void sign (int n){
        String result = (n>0)? "positive" :(n<0)? "negative" : "zero";
        System.out.println(result);
    }
}
/*
Given a method sign write the code so that its takes a number arguement and
tells you if its positive, negative or zero.

for example :

sign(5)  => positive
sign(5)  => positive
sign(-30) => negative
sign(-30) => negative
sign(0)  => zero
 */