package day24_methods;

import java.util.Arrays;

public class array_descending {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 9, 7};
        int[] b = {1000, 5999, 56, 4567};
        int[] c = {45, 78, 99, 123, 767};
        a = descending(a);
        b = descending(b);
        c = descending(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

    public static int[] descending(int[] arr) {
        Arrays.sort(arr);
        int[] reverarr = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            reverarr[i] = arr[j];
            j--;
        }
        return reverarr;

    }
}