package day21_multidimensinol_arrays;

public class foreachloop {
    public static void main(String[] args) {
        int num[] = {1,3,5,7,9};
        for (int eachloop : num){
            System.out.println(eachloop);

        }
        String [] names = {"sefasrgser" , "sefaergtwe5", "fhjryujf"};
        for (String na :names){
            System.out.println(na);
        }
        int [] num1 = {1,2,3,4,5,6,7,8,9,10};
        for (int a :num1 ){
            if (a<=5){
                continue;

            }
            System.out.print(a);

        }

        String sen = "i like loluc";
        String [] as = sen.split(" ");

        for (String se:as){
            System.out.println(se);
        }
        for (int x =as .length-1; x>=0; x-- ){
            System.out.println(as[x]);
        }

    }
}
