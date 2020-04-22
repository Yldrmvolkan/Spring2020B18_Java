package day14_stringcontinue;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        String username = "cybertek";
        String password = "ctbertekschool";
        Scanner input= new Scanner(System.in);
        System.out.println("enter your username");
        String userna = input.next();
        System.out.println("enter passwiord");
        String passwo = input.next();
        boolean valid = userna.equals(username) && passwo.equals(password);
        if (valid){
            System.out.println("login");
        }else {
            System.out.println("invalid");
        }



    }
}
