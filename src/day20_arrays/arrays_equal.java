package day20_arrays;

import java.util.Arrays;
import java.util.SortedMap;

public class arrays_equal {
    public static void main(String[] args) {
        int [ ] a = {1,2,3};
        int [] b = {1,2,3};
        boolean result = Arrays.equals(a,b);
        System.out.println(result);
        int [] c = {3,2,1};
        int [] d = {2,1,3};
        Arrays.sort(c);
        Arrays.sort(d);
        boolean result2 = Arrays.equals(c,d);
        System.out.println(result2);
    }
}
