package day16_forloop;

public class calculatesum_100 {
    public static void main(String[] args) {
        int sum  =0;
        int sum1 =0;
        for ( int even =0; even <=100; even++){
            if (even %2 ==0){
                sum += even;
            } else{
                sum1 += even;
            }
        }
        System.out.println(sum1);
        System.out.println(sum);
    }
}
