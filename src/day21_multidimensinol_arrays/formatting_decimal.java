package day21_multidimensinol_arrays;

import java.text.DecimalFormat;

public class formatting_decimal {
    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("0.00");
        double a = 10.0/3.0;
        System.out.println(a);
        System.out.println(df.format(a));
    }
}
