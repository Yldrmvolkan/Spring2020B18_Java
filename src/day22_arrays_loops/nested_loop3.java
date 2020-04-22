package day22_arrays_loops;

import java.util.Arrays;

public class nested_loop3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        System.out.println(Arrays.deepToString(numbers));
        for (int a =0; a<numbers.length; a++){
            for (int b =0; b<numbers[a].length; b++){
                System.out.print(numbers[a][b]+" ");
                int num =numbers[a][b];
                if (num%2==0){
                    System.out.print("even numbers: "+num);
                }else{
                    System.out.print("odd numbers: "+num);
                }

            }
        }

        }
    }

