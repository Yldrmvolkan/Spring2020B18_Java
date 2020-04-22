package day05_Unary_ShorthandOperators;

public class divisibility {
    public static void main(String[] args) {
       int no1 = 65;
       boolean divisibleby2 = no1 % 2 ==0 ;
       boolean divisibleby3 = no1 % 3 ==0 ;
       boolean divisibleby5 = no1 % 5 ==0 ;
        System.out.println(no1 + " is divisible by 2: "+ divisibleby2);
        System.out.println(no1 + " is divisible by 3: "+ divisibleby3);
        System.out.println(no1 + " is divisible by 5: "+ divisibleby5);

        String res1 = no1 + " is divisible by 2: "+ divisibleby2;
        String res2 = no1 + " is divisible by 3: "+ divisibleby3;
        String res3 = no1 + " is divisible by 5: "+ divisibleby5;
        System.out.println(res1 + "\n" + res2 + "\n" + res3);


    }
}
