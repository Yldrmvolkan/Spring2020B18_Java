package ternary_odevler;

public class numbertoWords {
    public static void main(String[] args) {
        int num = 9;
        String word = (num==1)? "one" : (num==2)? "iki" : (num==3)? "uc" : "-9";
        System.out.println(word);

    }
}
