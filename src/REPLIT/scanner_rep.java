package REPLIT;

import java.util.Scanner;

public class scanner_rep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your item1: ");
        String item1 = scan.next();
        double item1pri = scan.nextDouble();
        System.out.println("enter your item2: ");
        String item2 = scan.next();
        double item2pri = scan.nextDouble();
        System.out.println("enter your item3: ");
        String item3 = scan.next();
        double item3pri = scan.nextDouble();
        System.out.println(item1 +", "+"price: "+ item1pri+", "+item2+": "+"price: "+ item2pri+", "+item3+": "+"price: "+item3pri);
        System.out.println("total price is: " + item1pri + item2pri+ item3pri);
    }
}
