package day15_forloop;

public class forloop_practice {
    public static void main(String[] args) {
        for(int num =1; num<100; num+=2){
            System.out.print(num+" ");
            for (int num1 = 0; num1<=100; num1+=2){
                System.out.println(num1 +" ");
            }
        }
    }
}
