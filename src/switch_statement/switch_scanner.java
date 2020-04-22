package switch_statement;
import java.util.Scanner;

public class switch_scanner {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("enter your first number: ");
        byte num1 = input.nextByte();
        System.out.println("enter your second number: ");
        byte num2 = input. nextByte();
        int total = (num1 + num2);
        System.out.println("the sum of those two numbers are: " + total );
    }
}
