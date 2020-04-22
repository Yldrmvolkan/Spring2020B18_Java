package day20_arrays;

import java.util.Arrays;

public class arrays_utilities {
    public static void main(String[] args) {
        int [] arr= {1,2,3};
        String a = Arrays.toString(arr);
        System.out.println(a);
        String[] names = {"cano" , "loluc", "enis"};
        System.out.println(Arrays.toString(names));
        double[] nums= {10 ,20 ,30 ,40};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums [3]);
    }
}
