package day18_nestedloop;

import java.util.Scanner;

public class nested_practice {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        while (true){
            System.out.println("enter two numbers");
            int num1 = input.nextInt();
            int num2= input.nextInt();

            System.out.println("additions of two number: "+(num1+num2));
            System.out.println("do you want to continue");
            String answers = input.next();
            if( ! ( answers.equalsIgnoreCase("yes")||answers.equalsIgnoreCase("no"))){
                System.out.println("invalid entry, please re enter two number");}

            if(answers.equalsIgnoreCase("no")){
                System.out.println("thanks");
                break;
            }
        }
    }
}
