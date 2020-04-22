package day20_arrays;

import java.util.Arrays;

public class arrays_sorting {
    public static void main(String[] args) {
        int [] a = {2,56,23,89,-45,99};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("min number is: "+ a[0]);
        System.out.println("max num is: "+ a[a.length-1]);



        char [] ch = {'Z','D','G','R','E','H'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String names[]= {"deniz", "osman", "enis","cano"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("=================================");
        int ar[] = {4,68,-90,-99,58};


        int ardescen[] = new int [ar.length];
        int k =0;
        for (int i = ar.length-1; i>=0; i--){
            ardescen[k] = ar[i];
            k++;
            System.out.println(Arrays.toString(ardescen));
        }





    }
}
