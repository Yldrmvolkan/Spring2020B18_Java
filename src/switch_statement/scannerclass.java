package switch_statement;
import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " enter byte number: ");
        byte num = input.nextByte();
        System.out.println("you have entered" + num);
        if (num % 2== 0){
            System.out.println(" is even number");

        }else {
            System.out.println(" odd number");
        }

    }
}
