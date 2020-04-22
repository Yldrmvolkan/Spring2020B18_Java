package day05_Unary_ShorthandOperators;

public class postpre_practice {
    public static void main(String[] args) {
        int ab = 50;
        ab = --ab + ab++ + ab-- + ab++;
        //   49 + 49 + 50 + 49
        System.out.println(ab);
         int x = 4;
         int y = x * 4 - x++;
        System.out.println(y);
        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        System.out.println(a);
    }
}
