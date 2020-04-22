package day18_nestedloop;

public class do_While_practice {
    public static void main(String[] args) {
        int num =0;
        do{
            if(num%2!=0){
                System.out.print(num+" ");
            }

            num++;
        }while(num<=100);
    }
}
