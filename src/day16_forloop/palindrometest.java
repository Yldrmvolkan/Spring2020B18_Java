package day16_forloop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class palindrometest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your words");
        String word = input.nextLine();
        String reservedword ="";
        for (int i = word.length()-1; i >=0; i--){
            reservedword += word.charAt(i);

        }
        boolean palindrome = word.equalsIgnoreCase(reservedword);
        System.out.println(palindrome);
    }
}
