package day22_arrays_loops;

public class count_odd_even {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int counteven = 0;
        int countodd =0;
        for (int cou : num){
            if (cou%2!=0){
                countodd++;
            }else {
                counteven++;
            }
        }
        System.out.println("odd numbers: "+ countodd);
        System.out.println("even numbers: "+ counteven);

    }
}
