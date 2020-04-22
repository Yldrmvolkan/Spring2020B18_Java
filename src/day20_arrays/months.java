package day20_arrays;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[] months ={"jan" , "feb", "marc", "april", "may", "june" , "july" , "aug" , "sep" , "oct" , "nov" , "dec"};
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        while (num>12 || num<=0){
            System.out.println("invalid");
            System.out.println("reenter number");
            num = input.nextInt();
        }
        String result = months[num-1];
        System.out.println(result);
    }
}
