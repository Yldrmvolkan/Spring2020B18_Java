package day06_Shorthnd_LogicalOperators;

public class ifstatement_practice {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        if(a>b){
            System.out.println(a + "  is greater than"+ b);

        }
    if(b>a){
        System.out.println(b + "  is greater than  "+ a);
        int a1 = 1;
        int b1 = 2;
        if (b1>a1){
            System.out.println(b1 +  " is greater");

        }

        int num1 = 3;
        int num2 = -3;
        int num3 = 0;
        if(num1>0){
            System.out.println("positive");
            if(num2<0){
                System.out.println("negative");
                if(num3==0){
                    System.out.println("zero");
                }
            }
        }
    }


    }



}
