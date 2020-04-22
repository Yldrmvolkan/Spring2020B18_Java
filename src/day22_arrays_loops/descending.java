package day22_arrays_loops;

import java.util.Arrays;

public class descending {
    public static void main(String[] args) {
        int [] a = {-2, 16,65,78,-99};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    int [] rev = new int[a.length];
    int k = a.length-1;
    for (int x = 0; x<a.length; x++){
        rev[x] = a[k];
        k--;

    }
        System.out.println(Arrays.toString(rev));
}}
