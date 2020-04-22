package REPLIT;

import java.util.Scanner;
public class april_02 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter your item");
        String item = input.next();
       int hat = 25;
       int pants =50;
      int laptop = 300;
       int cupcake = 2;
       int gift = 100;


        String items=     (gift>hat)? "thank you for your purchase!" + "\n"+  "your current purchase is: 75$" :
                      (gift>pants)? "thank you for your purchase!" + "\n"+  "your current purchase is: 50$" :
                              (gift>laptop)? "sorry not enough funds": "invalid item";
        System.out.println(items);



    }
}