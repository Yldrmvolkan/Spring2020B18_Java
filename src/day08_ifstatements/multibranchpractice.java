package day08_ifstatements;

public class multibranchpractice {
    public static void main(String[] args) {
        double score = 85.5;
        boolean a =score >= 90 && score <= 100;
        boolean b = score >= 80 && score < 90;
        boolean c = score >= 70 && score < 80;
        boolean d = score >= 60 && score < 70;
        boolean f = score >= 0 && score <= 59;
        char grade = ' ';

        if (a){
           grade = 'a';

        }else if (b) {
            grade = 'b';
        } else if (c){
            grade = 'c';

        }else if (d) {
            grade = 'd';

        } else {
            grade ='f';
        }
        System.out.println("score " + score + " is: "+ grade );


    }
}
