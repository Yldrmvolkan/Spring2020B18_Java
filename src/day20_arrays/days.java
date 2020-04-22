package day20_arrays;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String[] days = {"mon", "tue", "wed", "thur" ,"fri" , "sat" ,"sun"};
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        while (num<7 || num <=0){
            System.out.println("invalid");
            System.out.println("re enter");
             num = input.nextInt();
        }
        String result = days[num-1];
        System.out.println(result);
    }
}
