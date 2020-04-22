package day09_Nestedif_Ternary;

public class NestedIf {

    public static void main(String[] args) {
        int age =18;
        boolean UScitizen = true;
        if (UScitizen) {
            if (age > 17) {
                System.out.println("eligible to vote");
            } else {
                System.out.println("growing");
            }
        }else{
            System.out.println("only us citizen");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        int score = 98;
        String grade = "";

        if (score >= 0 && score<=100){
            if (score >= 90) {
                grade="A";
            }else if(score>=80) {
                grade = "B";
            }
        }else{
                grade = "invalid";
            }
            }
        }










