package day12_java_recap;

import java.util.Scanner;

public class scanner_next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input. next();   // only takes first word
        System.out.println(str);
        String fulladress = input.next();
        System.out.println("enter your building number: ");
        short bnum = input.nextShort();
        fulladress += bnum +" ";
        System.out.println("enter street name: ");
        String stre = input. next();
        fulladress += stre + " ";
        System.out.println("enter the type of road: ");
        String rdtype = input.next();
        System.out.println("enter city name: ");
        String cityname = input.next();
        System.out.println("enter state name: ");
        String state = input.next();
        System.out.println("enter zipcode: ");
        short zipcode = input.nextShort();

    }
}
