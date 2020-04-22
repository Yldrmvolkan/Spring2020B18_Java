package REPLIT;

import java.util.Scanner;

public class zabah_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "welcome to grader ");
        System.out.println("enter your math grade");
        double mathgrade = input.nextDouble();
        System.out.println("enter your bio grade");
        double biograde = input.nextDouble();
        System.out.println("enter your history grade");
        double historygrade = input.nextDouble();
        System.out.println("enter your class name: ");
        String clas = input.next();
        System.out.println("enter your GEO grade");
        double geograde = input.nextDouble();
        System.out.println( "SUMMARY: " + mathgrade+biograde+historygrade+geograde);

    }
}
