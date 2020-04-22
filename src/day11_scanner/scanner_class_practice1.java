package day11_scanner;

import java.util.Scanner;

public class scanner_class_practice1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your first name: ");
        String firstname = input.next();
        System.out.println("enter your last name: ");
        String lastname = input.next();
        String fullname = firstname+" "+lastname;
        System.out.println("fullname is: "+ fullname);
        System.out.println("are you employeed?");
        boolean bool = input.nextBoolean();
        if (bool==true){
            System.out.println("enter your salary:");
            int salary = input.nextInt();
        }else{
            int issiz = input.nextInt();
        }



    }
}
