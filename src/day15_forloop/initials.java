package day15_forloop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("first name");
        String firstname= scan.next();
        System.out.println("lastname");
        String lastname = scan.next();
        //String initials = firstname.substring(0,1) + lastname.substring(0,1);
        String initials ="" + firstname.charAt(0)+ lastname.charAt(0);
        //                "" isareti koymak lazim string vermesi icin
        initials = initials.toUpperCase();
        initials = initials.toLowerCase();
        System.out.println(initials);
    }
}
