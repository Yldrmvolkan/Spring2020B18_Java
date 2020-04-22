package day18_nestedloop;

public class dividetwonumbers {
    public static void main(String[] args) {
        int a=15;
        int b=3;
        int count =0;
        while(a>=b){
            a-=b;
            count++;
        }if(b==0){
            System.out.println("b cannot be zero");
            System.exit(0);
        }

        System.out.println(count);

    }
}
