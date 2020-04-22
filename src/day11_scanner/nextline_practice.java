package day11_scanner;

import java.util.Scanner;

public class nextline_practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guest1 = "";
        String guest2 = "";
        String guest3 = "";
        String gue   ="";

        System.out.println("enter guest name: ");
        guest1 = input.next();
        System.out.println("do you want to enter your guest");
        guest2 = input.next();
        if (guest2.equalsIgnoreCase("yes") ) {
            System.out.println("please enter second name");
            guest3 = input.next();
            System.out.println("do you enter another");
            gue = input.next();
        }if (gue.equalsIgnoreCase("no"))
            System.out.println("guest name is: "+guest1+" "+guest3);






        }


    }

