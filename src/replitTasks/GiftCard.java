package replitTasks;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item =scan.next();
        int balance=100;
        int price=scan.nextInt();
        int leftOverBalance= balance-price;

        String result = " ";
        //blanket,ChargerHat,Headphones,Laptop,Pants,Pillow,Smartphone,Socks,USBcable

        if (price>=0 && price<100){
            switch(item){
                case "Blanket": case "Charger": case "Hat": case "Headphones": case "Laptop": case "Pants":
                case "Pillow": case "Smartphone": case "Socks": case "USB cable":
                result= "Thank you for your purchase!"+ "\nYour current balance is: "+ leftOverBalance+ "$";
                break;
                default:
                result= "Invalid item!";
                break;
            }

        }else{
           result = "Sorry, not enough funds on your gift card!";
        }
        System.out.println(result);

    }
}
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement
 */