package day24_methods;

import java.util.Arrays;

public class tasksfromyesterday {
    public static void main(String[] args) {
        int [] arr= {1,4,7,9,3,5};
        maxnumber(arr);
        minnumber(arr);
        descending(arr);

    }
    public static void maxnumber(int [] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    public static void minnumber(int [] arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    public static void descending(int [] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
