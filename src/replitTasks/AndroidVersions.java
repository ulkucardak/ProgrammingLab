package replitTasks;

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double version= 0.1;
        version = scan.nextDouble();
        String name = " ";

       if (version==1.0){
           name= "No codename";
       }else if(version==1.1){
           name="No codename";
       }else if(version==1.5){
           name="Cupcake";
       }else if(version==1.6){
           name="Donut";
       }else if(version==2.0){
           name="Eclair";
       }else if(version==2.2){
           name="Froya";
       }else if(version==2.3){
           name="Gingerbread";
       }else if(version==3.0){
           name="Honeycomb";
       }else if(version==4.0){
           name="Ice Cream Sandwich";
       }else if(version==4.1){
           name="Jelly Bean";
       }else if(version==4.4){
           name="KitKat";
       }else if(version==5.0){
           name="Lollipop";
       }else if(version==6.0){
           name="Marshmallow";
       }else if(version==7.0){
           name="Nougad";
       }else if(version==7.1){
           name="Nougat";
       }else if(version==8.0){
           name="Oreo";
       }else if(version==8.1){
           name="Oreo";
       }else if(version==9.0){
           name="Pie";
       }else if(version==10){
           name="Android 10";
       }else if(version==11){
           name="Android 11";
       }else{
           name="Sorry, I don't know this version!";
       }
        System.out.println(name);

    }
}


/*
No codename	1.0	1	September 23, 2008
No codename	1.1	2	February 9, 2009
Cupcake	1.5	3	April 27, 2009
Donut	1.6	4	September 15, 2009
Eclair	2.0 - 2.1	5 - 7	October 26, 2009
Froyo	2.2 - 2.2.3	8	May 20, 2010
Gingerbread	2.3 - 2.3.7	9 - 10	December 6, 2010
Honeycomb	3.0 - 3.2.6	11 - 13	February 22, 2011
Ice Cream Sandwich	4.0 - 4.0.4	14 - 15	October 18, 2011
Jelly Bean	4.1 - 4.3.1	16 - 18	July 9, 2012
KitKat	4.4 - 4.4.4	19 - 20	October 31, 2013
Lollipop	5.0 - 5.1.1	21- 22	November 12, 2014
Marshmallow	6.0 - 6.0.1	23	October 5, 2015
Nougat	7.0	24	August 22, 2016
Nougat	7.1.0 - 7.1.2	25	October 4, 2016
Oreo	8.0	26	August 21, 2017
Oreo	8.1	27	December 5, 2017
Pie	9.0	28	August 6, 2018
Android 10	10.0	29	September 3, 2019
Android 11	11
 */
/*
Android is one of the best operating systems in the world that helps the billion of users
who use smart phones and tablets. Also, Android versions always had some funny names related to sweets.
In this assignment, you need to write a program that will print a name of Android version,
based on number.
Please refer to the link beneath, in order to develop your if statement. https://www.javatpoint.com/android-versions

Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.

Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb 4.0 - Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake
input: 1.5
output: Cupcake
input: 9.0
output: Pie
input: 9.0
output: Pie
input: 11.0
output: Sorry, I don't know this version!
 */