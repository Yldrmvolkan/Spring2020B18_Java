package day18_nestedloop;

public class do_While_loop2 {
    public static void main(String[] args) {

        int number = 103;
        while (number >= 100) {
            System.out.println(number);
            number--;
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int number2 = 103;
        do {
            System.out.println(number2);
            number--;
        }while (number2<100);

    }
}
