package day11_scanner;
import java.util.Scanner;

public class salarycalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your salary: ");
        int salary = input.nextInt();
        System.out.println("enter your state tax: ");
        byte statetax = input.nextByte();
        double statetaxpercent = statetax / 100.0;
        System.out.println("enter your federal tax: ");
        byte federaltax = input.nextByte();
        double federaltaxpercent = federaltax / 100.0;
        double totaltax= (statetaxpercent+ federaltaxpercent) * salary;
        double salaryaftertax = salary - totaltax;
        System.out.println(" your salary after tax is: "+ salaryaftertax);
        }
    }

