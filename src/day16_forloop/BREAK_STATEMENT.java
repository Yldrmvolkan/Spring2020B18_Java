package day16_forloop;

public class BREAK_STATEMENT {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("hello");
        }

        for (char ch = 'a'; ch<='z';ch++){
            if (ch =='d'){
                break;

            }
            System.out.println(ch); ////   if statemnt oncesine yazilirsa bi fazlasini verir
        }
    }
}