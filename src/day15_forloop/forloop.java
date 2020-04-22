package day15_forloop;

public class forloop {
    public static void main(String[] args) {
        for (int i =-2; i<5; i++) {
            System.out.println("seymos");
            for (int is = 1; is<10; ++is){ //   is+=2:1,3,5,7,9
                System.out.println(is +" : "+(is*is));      //   is++:1,2,3,4,5,6,7,8,9
            }
        }
    }
}
