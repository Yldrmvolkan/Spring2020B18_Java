package day14_stringcontinue;

import java.util.Scanner;

public class combine_two_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first word");
        String firstword = input.next();
        System.out.println("enter second word");
        String secword = input.next();
        String result = firstword.concat(" "+secword).concat(" "+secword).concat(" "+firstword);
        System.out.println(result);
        System.out.println("enter word");
        String word = input.next();
        System.out.println("enter second word");
        String word2 = input.next();
        String result1 = word.substring(1).concat(word2.substring(1));
    }
}
