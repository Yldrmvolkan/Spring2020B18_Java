package day13_String;

import java.util.Scanner;

public class shippinn_info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter bulding number: ");
        String bulnum = input.next();
        input.nextLine();
        System.out.println("enter street adress:");
        String adress = input.nextLine();
        System.out.println("enter your city name: ");
        String city = input.next();
        System.out.println("enter your state: ");
        String state = input.next();
        System.out.println("enter your zipcode: ");
        int zip = input.nextInt();
        System.out.println("enter fullname: ");
        String full =input.next();
    }
}
