package REPLIT;

import java.util.Scanner;

public class day_01_04_20 {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.next();
        int name1 = name.length();
        System.out.println(name1);
*/
        System.out.println("++++++++++++++++++++");
       String name ="seyma peker";
       String name2 ="enis yildirim";

        Scanner input =new Scanner(System.in);
        System.out.println("enter your fullname1: ");
        String fullname1=input.nextLine();

        System.out.println("enter your fullname2: ");
        String fullname2=input.nextLine();
      boolean fullnametrue = name.equals(fullname1) && name2.equals(fullname2);
      if (fullnametrue){
    System.out.println("name found");

       }else{
    System.out.println("name not found");
}




    }
}
