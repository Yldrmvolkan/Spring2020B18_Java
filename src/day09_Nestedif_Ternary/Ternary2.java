package day09_Nestedif_Ternary;

public class Ternary2 {

    public static void main(String[] args) {

        String result = (9>10) ? "9 is greater" : "10 is a greater";
        System.out.println(result);


        System.out.println("==========================================================");

        int age = 20;
        boolean eligibilty =(age>=21) ? true : false ;
        System.out.println(eligibilty);


        System.out.println("=======================================================" );

        int ageOfperson =20;
        String tovote = (ageOfperson>=18 ? "yes " : "no");
        System.out.println(tovote);
        System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");



    }
}
