package day16_forloop;

public class continue_statement {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++){

            if (i==3){
                continue;
            }
            System.out.println(i);   // if statement onune konursa 3 de yazilir
        }

        for (int a = 0; a <=20; a ++){
            if (a %2 ==0){
                continue;
            }
            System.out.print(a+" ");
        }
    }
}
