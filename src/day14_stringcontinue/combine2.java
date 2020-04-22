package day14_stringcontinue;

import java.util.Scanner;

public class combine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String word = input.next();
        System.out.println("enter second word");
        String word2 = input.next();
        String result1 = word.substring(1).concat(word2.substring(1));
        System.out.println(result1);
    }
}
