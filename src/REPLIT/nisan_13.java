package REPLIT;

import java.util.Scanner;

public class nisan_13 {
    public static void main(String[] args) {
        /*
        A sandwich is two pieces of bread with something in between.
        Print the string that is between the first and last appearance of "bread" in the given string,
        or return string "nothing" if there are not two pieces of bread.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your input");
        String a = input.next();

        if (a.startsWith("bread") && a.endsWith("bread") ){
            System.out.println(a.substring('d','b'));
        }
        }
    }

