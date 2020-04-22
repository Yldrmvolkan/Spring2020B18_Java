package day09_Nestedif_Ternary;

public class Ternary_Practice {

    public static void main(String[] args) {
        int number = 100;
        char ch1 = (number>0 ) ? '+' :(number<0)? '-' : '0' ;
        System.out.println(ch1);


        System.out.println("==================================================");

        byte score = 50;
        String grade = (score>=90 && score<=100) ? "A" : (score>=80 && score<90) ? "B" : (score>=70 && score<80)? "C" : (score>=50 && score<60)? "D" : "F";
        System.out.println(grade);

        System.out.println("+++++++++++++++");




    }
}
