package replitTasks;

public class Loops_PrintEvenNumbers {
    public static void main(String[] args) {
        String result = "";
        for (int i = 80; i >=20 ; i--) {
            if(i%2==0){
                result += " "+ i;
            }
        }
        result = result.replaceFirst(" ","");
        System.out.println(result);
    }
}
/*
Write a for loop that prints all even integers from 80 through and including 20.
Seperate each number with a space
 */