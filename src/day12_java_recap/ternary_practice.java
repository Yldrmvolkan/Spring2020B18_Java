package day12_java_recap;

public class ternary_practice {
    public static void main(String[] args) {

        char ch1 ='A';
        String result = (ch1=='A')? "A is selectred" :(ch1=='B')? "b selected" : (ch1=='C')? "c selected" : "invalid chaaracter";

        System.out.println(result);
    }
}
