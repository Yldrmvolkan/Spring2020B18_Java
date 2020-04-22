package day23_custom_metods;

public class methodswith_parameters {
    public static void main(String[] args) {
        eligiblealcoholage(45);
    }
    public static void eligiblealcoholage(int age){
        if (age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("buy milk");
        }

    }

}
