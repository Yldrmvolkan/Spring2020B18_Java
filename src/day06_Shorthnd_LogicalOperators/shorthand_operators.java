package day06_Shorthnd_LogicalOperators;

public class shorthand_operators {
    public static void main(String[] args) {
        int x = 20;
        x += 10;
        x = 30;
        System.out.println(x);
        String schoolname = "cybertek";
        schoolname += 12345;
        System.out.println(schoolname);
        System.out.println('a' + 'b');
        //                  97 + 98 ==> 195

        char ch1 = 'a';
        ch1 += 'b';
        System.out.println(); // ==>character

        int num = 'z';
        num += 'x';

        int q = 20;
        int p = q*=20*3;
        //     20*60
    }
}
