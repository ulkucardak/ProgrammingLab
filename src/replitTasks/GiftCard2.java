package replitTasks;

import java.util.Scanner;

public class GiftCard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 100;
        String item = scan.nextLine();

        if (item.equals("Blanket")){
            balance -= 60;
        }else if(item.equals("Charger")){
            balance-= 25;
        }else if(item.equals("Hat")){
            balance -= 25;
        }else if(item.equals("Headphones")){
            balance -= 30;
        }else if(item.equals("Laptop")){
            balance -= 200;
        }else if(item.equals("Pants")){
            balance -= 50;
        }else if (item.equals("Pillow")){
            balance -= 40;
        }else if (item.equals("Smartphone")){
            balance -=1000;
        }else if (item.equals("Socks")){
            balance -=5;
        }else if(item.equals("USB cable")){
            balance -= 10;
        }else{
            System.out.println("Invalid item!");
        }
        if (balance>0){
            System.out.println("Thank you for your purchase!"+ "\nYour current balance is: "+ balance+ "$");
        }else if(balance<0){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
    }
}
//blanket,ChargerHat,Headphones,Laptop,Pants,Pillow,Smartphone,Socks,USBcable
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement
 */