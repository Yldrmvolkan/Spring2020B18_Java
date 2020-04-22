package day22_arrays_loops;

import java.util.Arrays;

public class multidi_arrays {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [][] b = {{1,2,3}};
        int [] c=  b [0];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.toString(c));
    }
}
