package day11_scanner;

import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a long number: ");
        long a = input.nextLong();
        System.out.println("you have entered: "+a );
        System.out.println("enter decimal number: ");
        float b = input.nextFloat();
        System.out.println("enter your sentence:");
        String str = input.next();
        System.out.println("today is gret day");


    }
}
