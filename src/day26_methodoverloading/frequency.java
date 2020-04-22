package day26_methodoverloading;


public class frequency {
    public static void main(String[] args) {


        String str = "AAA";
        char ch = 'A';
        char[] arr = str.toCharArray();
        int count =0;
        for (char each : arr){
            if (each==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
