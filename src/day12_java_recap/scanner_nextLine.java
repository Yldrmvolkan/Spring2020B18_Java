package day12_java_recap;

import java.util.Scanner;

public class scanner_nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your building number: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("street is: ");
        String stre = input.nextLine();
        System.out.println("Street is: "+stre);
        System.out.println("zipcode");
        int zi = input.nextInt();
        System.out.println("fulladress is: ");
        String fulladress = num +", "+stre+", "+ "zi";
        System.out.println(fulladress);
    }

}
