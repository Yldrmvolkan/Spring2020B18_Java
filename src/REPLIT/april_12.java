package REPLIT;

import java.util.Scanner;

public class april_12 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("are you premium");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("enter your amount");
        int nbooksPurchased = scan.nextInt();
        if (isPremiumCustomer=true && nbooksPurchased>=5 && nbooksPurchased<=8){
            System.out.println(freeBooks+1);

        }else if (isPremiumCustomer=true&& nbooksPurchased>=8){
            System.out.println(freeBooks+2);
        }else if (isPremiumCustomer=false && nbooksPurchased>=7&&nbooksPurchased<=11){
            System.out.println(freeBooks+1);
        }else if (isPremiumCustomer=false&&nbooksPurchased>=12){
            System.out.println(freeBooks+2);
        }
    }
}
