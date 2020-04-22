package day22_arrays_loops;

import java.io.FileOutputStream;
import java.util.Arrays;

public class nestedfor_each {
    public static void main(String[] args) {
        int [][] a = {{1,3,5},{7,9,11}};
        for (int [] each:a){
            System.out.print(Arrays.toString(each));
        }
        System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}}}");
        char[][] ch = {{'A','B'},{'C','D'},{'E','F'}};
        for (char [] ab: ch){
            System.out.print(ab );
        }
    }
}
