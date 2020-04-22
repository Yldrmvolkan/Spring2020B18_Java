package day09_Nestedif_Ternary;

public class nesteP {

    public static void main(String[] args) {

        int score = 70;
        String grade ="";

        if(score>=0 && score<=100){

            grade= (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D": "F";

        }else{
            grade = "invalid";
        }


    }

}
