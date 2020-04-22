package day22_arrays_loops;

public class nestedloops {
    public static void main(String[] args) {
        char [][] a= {{'a','b'},{'c','d'},{'e','f'}};
        for (int i = 0; i <a[0].length; i++){
            System.out.println(a[0][i]);
        }
        for (int i=0; i<a[1].length; i++){
            System.out.println(a[1][i]);
        }
        for (int i=0; i<a[2].length; i++){
            System.out.println(a[2][i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        for (int k=0; k<a.length; k++){
            for (int s = 0; s<a[k].length; s++){
                System.out.println(a[k][s]);
            }
        }
    }
}
