package day12_java_recap;

import java.util.Arrays;

public class array_stringmethod {
    public static void main(String[] args) {

        String str = "i like seyma";
        String[] a = str.split(" ");
        System.out.println(Arrays.toString(a));
        String ab = "qbcddfg";
        String [] ac = ab.split("");
        Arrays.sort(ac);
        System.out.println(Arrays.toString(ac));
    }
}
