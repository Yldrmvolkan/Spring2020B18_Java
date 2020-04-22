package day05_Unary_ShorthandOperators;

public class unaryoperators {
    public static void main(String[] args) {
        int a = 10;
        int b = +a;
        System.out.println(a);
        System.out.println(b);
        int a2 = -10;
        boolean result1 = a2> 0;
        System.out.println(result1);
        int x1 = -10;
        int x2 = -x1;
        System.out.println(x2);
        int x3 = 20;
        int x4 = -x3;
        System.out.println(x4);
        int y = 100;
        System.out.println(--y);
        int abc = 100;
        System.out.println(abc++);
        System.out.println(abc--);
        System.out.println(abc);

        int aa = 100;
        System.out.println(++aa);
        System.out.println(--aa);
        System.out.println(aa++);
        System.out.println(aa--);
        System.out.println(aa);

    }

}
