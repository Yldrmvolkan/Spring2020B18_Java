package day22_arrays_loops;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int a = arr.length-1; a>=0; a--){
            int eachnum =arr[a];
            System.out.println(eachnum);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        int [] rever = new int[arr.length];
        int k = arr.length-1;
        for (int b =0; b< arr.length; b++){
            rever [b] = arr[k];
            k--;

        }
        System.out.println(Arrays.toString(rever));
    }
}
