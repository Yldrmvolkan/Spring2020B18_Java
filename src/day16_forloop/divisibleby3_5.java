package day16_forloop;

public class divisibleby3_5 {
    public static void main(String[] args) {
        for (int odd = 0; odd < 100; odd +=2) {
            if (odd %2 ==0){
                if (odd %3 ==0 && odd %5 ==0){
                    System.out.println(odd+ " ");
                }
            }

        }

    }
}