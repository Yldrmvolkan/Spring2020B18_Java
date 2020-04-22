package day17_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Creantials {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter user name");
        String username =input.next();
        System.out.println("enter password");
        String password =input.next();
// boolean kullanabilirsin
        while(!(username.equals("cybertek")&&password.equals("cybertek123"))){
            System.out.println("please re enter your credentions");
            System.out.println("enter user name ");
            username=input.next();

            System.out.println("enter pass word");
            password=input.next();

        }
        System.out.println("logged in");
    }
}
