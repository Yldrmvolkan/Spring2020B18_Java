package day22_arrays_loops;

public class nested_loop2 {
    public static void main(String[] args) {
        int [][] a= {{1,2,3},{4,5,6},{7,8,9}};

        for (int f =0; f<a.length; f++){
            for (int i=0; i<a[f].length; i++){
                System.out.print(a[f][i]+" ");
            }
            System.out.println();

        }
    }
}
