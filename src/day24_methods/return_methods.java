package day24_methods;

import java.util.Arrays;

public class return_methods {
    public static void main(String[] args) {
        int [] arr ={4,7,90,12,56};
        int max= maxnum(arr);
        int min = maxnum(arr);
        //System.out.println(max);
        System.out.println(min);
     }
    public static int maxnum(int [] arr) {
        Arrays.sort(arr);
      // return arr[arr.length-1];
       return arr[4];

    }
}
