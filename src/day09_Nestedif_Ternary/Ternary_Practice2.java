package day09_Nestedif_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 200;
        int min = (num1<num2)? num1 : num2 ;
        System.out.println(min);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int hour = 19;
        String result = (hour< 15 )? "good morning" :(hour>16 && hour<18)? "hello mello ": "nope";
        System.out.println(result);

        System.out.println("----------------------------------------------------------");

        int number =12000;
        boolean d3And5 = (number % 3==0 && number % 5==0)? true : false;
        System.out.println(d3And5);

    }

}
