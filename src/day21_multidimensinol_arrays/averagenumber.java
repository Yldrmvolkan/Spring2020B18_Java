package day21_multidimensinol_arrays;

public class averagenumber {
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        int length= a.length;
        int sum =0;
        for (int i=0; i<length; i++){
            int eachnum= a[i];
            sum +=eachnum;
        }
        double avarage = sum/ (double)length;
        System.out.println(sum/length);
        System.out.println(avarage);
    }
        }


