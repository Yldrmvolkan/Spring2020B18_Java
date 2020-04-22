package day14_stringcontinue;

import java.util.Scanner;

public class combine3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word");
        String word1 = input.next();
        String midchar = "";
        int totalchar = word1.length();
        int midnumber = totalchar/2;
        if (totalchar%2!=0){
            midchar += word1.charAt(midnumber);
            System.out.println(midchar);
        }
    }
}
